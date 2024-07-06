// Define a base class called Animal
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Define a derived class called Dog that extends Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Call methods of the Dog and Animal class
        dog.eat();  // Method from Animal class
        dog.bark(); // Method from Dog class
    }
}
