package com.sqli.test.dishes;

public enum Satellite {
    ASTRA(19.2),
    HOTBIRD(13.0),
    NILESAT(-7.0);
    private double degree;

    Satellite(double degree) {
        this.degree = degree;
    }

    public double getDegree() {
        return degree;
    }

}
