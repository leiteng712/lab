package org.example.design_mode.rmi.compound_model;

/**
 * @author: leiteng
 * @date: 2020/10/11 16:59
 * <p>
 * 适配器模式
 */
public class GooseAdapter implements Quackable {

    Observable observable;

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
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
        goose.honk();
        notifyObservers();
    }
}
