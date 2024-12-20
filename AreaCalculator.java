package com.polymorphism.area;

public class AreaCalculator {
    void calculateArea(){
        System.out.println("The area cannot be calculated. Invalid shape.");
    }

    void calculateArea(double side) {
        System.out.println("Square area: " + side * side);
    }

    void calculateArea(int length, int width) {
        System.out.println("Rectangle area: " + length * width);
    }

    void calculateArea(double length, double width) {
        System.out.println("Decimal rectangle area: " + length * width);
    }
}
