package org.example.design_mode.compound_mode;

/**
 * @author: leiteng
 * @date: 2020/10/11 16:51
 */
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
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
        System.out.println("Quack");
        notifyObservers();
    }
}
