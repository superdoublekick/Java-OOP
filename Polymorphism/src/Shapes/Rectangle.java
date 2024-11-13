package Shapes;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }
}
