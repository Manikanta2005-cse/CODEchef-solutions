class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeSound() {
        // Default implementation
        return "Generic animal sound";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Override the makeSound() method to return "Woof!"
    public String makeSound() {
        return "Woof!";
    }
    
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Override the makeSound() method to return "Meow!"
    public String makeSound() {
        return "Meow!";
    }
    
}

class Codechef {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy");

        // Create a Cat object
        Cat cat = new Cat("Whiskers");

        // Print the sounds of the animals
        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());
    }
}