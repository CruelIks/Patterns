package iks.pttrns.composite;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
