package org.example.design_mode.state_mode;

/**
 * @author: leiteng
 * @date: 2020/10/14 17:10
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
