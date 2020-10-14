package org.example.design_mode.compound_mode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: leiteng
 * @date: 2020/10/11 17:28
 * <p>
 * Observable 辅助类
 */
public class Observable implements QuackObservervable {

    ArrayList observers = new ArrayList();
    QuackObservervable duck;

    public Observable(QuackObservervable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
