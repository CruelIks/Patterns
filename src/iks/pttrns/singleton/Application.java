package iks.pttrns.singleton;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> codes = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Integer code = Integer.valueOf(SingletonClass.getInstance().hashCode());

                    if (!codes.contains(code)) {
                        codes.add(code);
                        System.out.println("Added " + code);
                    }
                }
            });
            thread.start();
        }
    }
}
