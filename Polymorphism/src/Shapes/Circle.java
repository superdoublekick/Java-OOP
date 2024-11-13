package Shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();

    }

     final double getRadius() {
        return radius;
    }

    @Override
    protected double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    protected double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
