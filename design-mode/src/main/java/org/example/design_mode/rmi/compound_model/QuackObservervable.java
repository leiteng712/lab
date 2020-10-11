package org.example.design_mode.rmi.compound_model;

/**
 * @author: leiteng
 * @date: 2020/10/11 17:25
 */
public interface QuackObservervable {
    
    void registerObserver(Observer observer);

    void notifyObservers();
}
