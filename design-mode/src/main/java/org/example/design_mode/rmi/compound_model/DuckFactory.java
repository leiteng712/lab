package org.example.design_mode.rmi.compound_model;

/**
 * @author: leiteng
 * @date: 2020/10/11 17:13
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }
}
