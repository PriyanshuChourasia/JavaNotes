// super construct is specifically used to invoke a constructor from the superclass. when you create a subclass object, the superclass constructor must be called to
// initialize the superclass part of the object


class Book{
    Book(){
        System.out.println("This is the book");
    }

    private String BookName(){
        return "This is a Parent Book";
    }

    public String getBookName(){
        return this.BookName();
    }
}

class HariStory extends Book{
    HariStory(){
        System.out.println("This is a Hari story book");
    }
}



// If a method is overridden in the subclass, you can use super.methodname() to call the version in the superclass

class Person{
    void walk(){
        System.out.println("A person can walk 10000 km");
    }
}

class Priyanshu extends Person{
    @Override
    void walk(){
        System.out.println("Priyanshu can walk more than 1000 km ");
    }
}


public class Super {
    public static void main(String[] args){
        Priyanshu priyanshu = new Priyanshu();
        Person person = new Priyanshu();
        priyanshu.walk();
        person.walk();
    }
}
