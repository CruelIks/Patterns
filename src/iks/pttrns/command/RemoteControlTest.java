package iks.pttrns.command;

import org.junit.Test;

public class RemoteControlTest {
    public RemoteControlTest() {
    }

    @Test
    public void buttonWasPressed_test() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Command lightOn = new LightOnCommand(new Light());
        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
    }

    @Test
    public void buttonWasPressed_testGarage() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Command garageOpen = new GarageDoorOpenCommand(new GarageDoor());
        remoteControl.setCommand(garageOpen);
        remoteControl.buttonWasPressed();
    }

    @Test
    public void testMacroCommand() {
        Command a = new LightOnCommand(new Light());
        Command b = new GarageDoorOpenCommand(new GarageDoor());

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setCommand(new MacroCommand(a, b));
        remoteControl.buttonWasPressed();

    }

}
