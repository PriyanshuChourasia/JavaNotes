package Excercise;

import java.util.Scanner;

public class BasicAirthmeticOperation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int fNum = sc.nextInt();
        System.out.println("Enter second number: ");
        int lNum = sc.nextInt();

        System.out.println("Sum = "+ (fNum+lNum));
        System.out.println("Diff = "+ (fNum-lNum));
        System.out.println("Product = "+ (fNum*lNum));
        System.out.println("Dividend = "+ (fNum/lNum));
        System.out.println("Modulus = "+ (fNum%lNum));
    }
}
