// Define the Drawable interface
interface Drawable {
    // Declare a method 'draw()' to draw shapes
    void draw();
}

class Circle implements Drawable {
    // Override the draw method for Circle
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
}

class Square implements Drawable {
    // Override the draw method for Square
    public void draw() {
        System.out.println("Drawing a square");
    }
    
}

class Codechef {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable square = new Square();
        // Call the draw method on both shapes
        circle.draw();
        square.draw();
    }
}