package com.sqli.test.dishes;

public class Dish {
    private double degree;

    Dish(double degree) {
        this.degree = degree;
    }

    void move(double deviation) {
        this.degree += deviation;
    }

    Integer signalPower(Satellite satellite) {
        Long difference = Math.round(Math.abs((this.degree - satellite.getDegree()) * 10));
        return Math.max(0, 10 - difference.intValue());
    }
}
