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


public class Super {
    public static void main(String[] args){
        HariStory hariStory = new HariStory();
        System.out.println(hariStory.getBookName());
//        System.out.println("")
    }
}
