public class BasicClass {

    public static void myName(){
        System.out.println("My name is Priyanshu Chourasia");
    }


    public void myNewName(){
        System.out.println("Hii I am Priyanshu Chourasia");
    }


    public String latestName(String name){
        return "My new name is "+name;
    }


    public static void main(String[] args){
        System.out.println("Base Class");
        myName();
        BasicClass myObj = new BasicClass();
        myObj.myNewName();
        String name = myObj.latestName("Depanshu");

        System.out.println(name);
    }
}
