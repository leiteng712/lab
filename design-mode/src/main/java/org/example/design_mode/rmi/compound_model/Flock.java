package org.example.design_mode.rmi.compound_model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: leiteng
 * @date: 2020/10/11 17:18
 * <p>
 * 迭代器模式
 */
public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    Observable observable;

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public Flock() {
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
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
            notifyObservers();
        }
    }
}
