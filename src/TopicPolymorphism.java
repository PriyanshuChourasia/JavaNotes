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
    @Override
    public void sound(){
        System.out.println("Cat does meow");
    }
}


/***
 * Overloading: Overloading feature is a feature which allows a class to have more than one method with the same name but different parameters. It is just like constructor
 * It increases readability of the program
 */


class  Calc{
//    This is the first method to add two integers
    public int add(int a,int b){
        return a+b;
    }

//    Overloaded method to add three integers
    public int add(int a,int b,int c){
        return a+b+c;
    }

//    Overloaded method to add two double values
    public double add(double a,double b){
        return a+b;
    }
}



public class TopicPolymorphism {
    public static void main(String args[]){
        //Overriding examples
//        Animal animal = new Bird();
//        Animal cat = new Cat();
//        animal.sound();
//        cat.sound();

        Calc  calculator = new Calc();

//        Calling add method with two integers
        System.out.println("Two parameter method are : "+ calculator.add(4,5));

//        Calling add method with three parameter
        System.out.println("Three parameter method are : "+ calculator.add(4,5,6));

//        Calling add method with two double parameter
        System.out.println("Double parameter method are: "+ calculator.add(5.66,67.44));

    }
}
