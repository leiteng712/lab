package org.example.design_mode.compound_mode;

/**
 * @author: leiteng
 * @date: 2020/10/11 16:54
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    void simulate() {
        /*MallardDuck mallardDuck = new MallardDuck();
        DuckCall duckCall = new DuckCall();
        GooseAdapter gooseDuck = new GooseAdapter(new Goose());*/

        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(duckCall);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
