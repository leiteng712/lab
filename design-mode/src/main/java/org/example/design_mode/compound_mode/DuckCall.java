package org.example.design_mode.compound_mode;

/**
 * @author: leiteng
 * @date: 2020/10/11 16:52
 */
public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Kwaw");
        notifyObservers();
    }
}
