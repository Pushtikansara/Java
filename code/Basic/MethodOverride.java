package Basic;
// Parent class
class Animal {
   static void sound() {
        System.out.println("Animal makes a sound");
    }
    public void colour()
    {
        System.out.println("Colour is black");
    }
}

// Child class
class Dog extends Animal {
    // Static methods cannot be overridden
    static void sound() {
        System.out.println("Dog barks");
    }
    public void colour() {
        System.out.println("Dog is white.");
    }

}


public class MethodOverride{
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        Animal myDog = new Dog();  //the method call is determined by the reference type not the object type
        Dog obj=new Dog();  


        Animal.sound(); 
        myDog.sound();   
        Dog.sound(); 
        
        myAnimal.colour(); 
        myDog.colour(); //not static so called child class method
        obj.colour(); 
    }
}
