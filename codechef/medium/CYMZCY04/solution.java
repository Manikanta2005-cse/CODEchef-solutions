
// Define the abstract class Shape here
abstract class Shape {
    // Declare a private String variable name
    private String name;
    
    // Define a constructor that takes a String parameter name
    public Shape(String name) {
        this.name = name;
    }
    
    // Define a method getName() that returns the name
    public String getName() {
        return name;
    }
    
    // Abstract method calculateArea() that returns area
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
}

class Codechef {
    public static void main(String[] args) {
        Circle circle = new Circle("MyCircle", 5);
        Rectangle rectangle = new Rectangle("MyRectangle", 4, 6);
        
        System.out.println(circle.getName() + " area: " + circle.calculateArea());
        System.out.println(rectangle.getName() + " area: " + rectangle.calculateArea());
    }
}