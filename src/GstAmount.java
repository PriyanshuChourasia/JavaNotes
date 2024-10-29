import java.util.*;

public class GstAmount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        double cost = scanner.nextDouble();
        double gstPercent = 5.0;
        double Gst = (cost*gstPercent)/100.0;
        double amount = cost + Gst;

        System.out.println("value of the product: "+cost);
        System.out.println("Value of the product with gst: "+amount);
    }
}
