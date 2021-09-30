package ru.mirea.task7.opt2;

abstract class Shape {
    String color;
    Boolean filled;

    public Shape(String color, Boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public Shape() {
    }
    String getColor()
    {
        return color;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    Boolean isFilled()
    {
        return filled;
    }
    void setFilled(Boolean isFilled)
    {
        filled = isFilled;
    }
    abstract double getArea();
    abstract double getPerimeter();
}

class Circle extends Shape
{
    double radius;
    public Circle() { }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean isFilled)
    {
        this.radius = radius;
        super.color = color;
        super.filled = isFilled;
    }
    double getArea()
    {
        return Math.PI * radius * radius;
    }
    double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    public String toString()
    {
        return String.format("Circle:\nS=%f\nP=%f\nColor=%s\nFilled = %s",
                getArea(), getPerimeter(), getColor(), isFilled());
    }
}

class Rectangle extends Shape
{
    double width;
    double length;
    public Rectangle() { }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, Boolean isFilled)
    {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = isFilled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    double getArea() {
        return width * length;
    }
    double getPerimeter() {
        return 2 * width + 2 * length;
    }
    public String toString()
    {
        return String.format("Rectangle:\nS=%f\nP=%f\nColor=%s\nFilled = %s",
                getArea(), getPerimeter(), getColor(), isFilled());
    }
}
