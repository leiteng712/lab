package org.example.design_mode.compound_mode;

/**
 * @author: leiteng
 * @date: 2020/10/11 17:14
 * <p>
 * 抽象工厂模式
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
