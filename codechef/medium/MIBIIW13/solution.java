abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

interface Speakable {
    void speak();
}

class Dog extends Animal implements Speakable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void speak() {
        System.out.print(name + " says: ");
        makeSound();
    }
}

class Toy implements Speakable {
    @Override
    public void speak() {
        System.out.println("Toy says: Beep!");
    }
}

class Codechef {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Toy toy = new Toy();

        dog.speak();
        toy.speak();
    }
}