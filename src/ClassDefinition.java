// This is a calculator class which contains add method. It's a basic blueprint
class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}



class Name{
    private String myName(){
        return "My name is class";
    }

    public String getName(){
        return this.myName();
    }
}


/****
 * ClassDefinition this contains the main method which is the entry point of java program.
 * The main method in ClassDefinition creates an instance of Calculator, uses it to call add and print result
 */
public class ClassDefinition {
    public static void main(String[] args){
//        Here we have created an instance of a class Calculator to access its properties using this statement
        Calculator myObj = new Calculator();
//        calling add method
        int sol  = myObj.add(34,56);
        System.out.println(sol);

        Name n = new Name();
        System.out.println(n.getName());
    }
}
