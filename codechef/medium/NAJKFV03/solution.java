class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        // Default implementation, can be overridden by subclasses
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Codechef {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        System.out.println(circle.getName() + " Area: " + circle.getArea());
        System.out.println(square.getName() + " Area: " + square.getArea());
    }
}