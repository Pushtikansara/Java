package Basic;
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override // Annotation to indicate overriding
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to test
public class MethodOverride{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal reference, Animal object
        Animal myDog = new Dog();        // Animal reference, Dog object

        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();    // Output: Dog barks
    }
}
