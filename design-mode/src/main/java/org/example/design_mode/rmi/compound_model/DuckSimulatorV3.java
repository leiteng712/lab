package org.example.design_mode.rmi.compound_model;

/**
 * @author: leiteng
 * @date: 2020/10/11 16:54
 */
public class DuckSimulatorV3 {

    public static void main(String[] args) {
        DuckSimulatorV3 duckSimulator = new DuckSimulatorV3();
        duckSimulator.simulate(new CountingDuckFactory());
    }

    void simulate(AbstractDuckFactory factory) {
        /*MallardDuck mallardDuck = new MallardDuck();
        DuckCall duckCall = new DuckCall();
        GooseAdapter gooseDuck = new GooseAdapter(new Goose());*/

        /*Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));*/

        Quackable mallardDuck = factory.createMallardDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(duckCall);
        flock.add(gooseDuck);

        System.out.println("Duck Simulator");

        simulate(flock);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
