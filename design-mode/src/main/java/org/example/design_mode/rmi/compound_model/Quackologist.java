package org.example.design_mode.rmi.compound_model;

/**
 * @author: leiteng
 * @date: 2020/10/11 17:38
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservervable duck) {
        System.out.println("Quackologist: " + duck + "just quacked.");
    }
}
