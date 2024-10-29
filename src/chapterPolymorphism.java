
// In this we will learn calling method

/***
 * Employee employee = new Rupesh();
 *  Now in this type of call :
 *          employee is a reference type of Employee and this Employee can be called as superclass or Interface.
 *          so since the employee is a type of employee and the object is itself defined as Rupesh class so employee reference can access functions
 *          which is defined in superclass or the methods which are overridden in subclass this reference cannot access any extra methods from its derived class
 *          which is it's subclass
 *
 * Rupesh rupesh = new Rupesh();
 *          rupesh is both reference type and object type of Rupesh. This reference of type Rupesh,so it can access all methods and field defined in
 *          the Rupesh class including those inherited from the Employee class. So this subclass can access all methods of its superclass as it have extended it
 *          to it superclass.
 *
 */




class Employee{
    void work(){
        System.out.println("The work time of employee of this organisation is 8 hours a day");
    }

    public void meet(){
        System.out.println("An employee should meet very nicely to their fellow ones");
    }
}


class Rupesh extends Employee{
    @Override
    void work(){
        System.out.println("Priyanshu works more than 8.5 hours a day");
    }

    public void greet(){
        System.out.println("Hello my name is Priyanshu");
    }
}



public class chapterPolymorphism {
    public static void main(String[] args){
        Rupesh rupesh = new Rupesh();
        rupesh.meet();
        Employee employee = new Rupesh();
        employee.work();
//        employee.greet();  cannot  access subclass methods as the reference type is of Superclass and this superclass have not extended to any
    }
}
