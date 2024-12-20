package com.polymorphism.area;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculate = new AreaCalculator();

        calculate.calculateArea();
        calculate.calculateArea(5);
        calculate.calculateArea(7,3);
        calculate.calculateArea(7.5, 6.7);
    }
}
