//Polymorphism : A base class can be referred to an object of a derived class.
/***
 * There are two type of polymorphism
 * 1. RunTime Polymorphism (overriding)
 * 2. Compile Time Polymorphism (overloading)
 *
 * Overriding allows the subclass to provide the implementation of a method that is already in super class
 * ***/


// This is 'a' example of overriding a parent class by subclass method

/***
 * In cat class we didnot used @Override annotation still it overrides the method of it's super class because Java uses dynamic method dispatch also
 * called runtime polymorphism to determine which sound() method is to be executed Since actual object of animal class is Cat so, Java calls
 * Cat sound method
 */


class Animal{
    public void sound(){
        System.out.println("Animal Speaks");
    }
}

class Bird extends Animal{
    @Override
    public void sound(){
        System.out.println("Bird's Chirp");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat does meow");
    }
}




public class TopicPolymorphism {
    public static void main(String args[]){
        //Overriding examples
//        Animal animal = new Bird();
//        Animal cat = new Cat();
//        animal.sound();
//        cat.sound();


    }
}
