package Firstjavaprogram;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = sc.nextInt();
        System.out.println("enter a second number");
        int num2 = sc.nextInt();

        System.out.println("Press 1 for Addition");
//        int num1 = sc.nextInt();
        System.out.println("Press 2 for Subtraction");
//        int num2 = sc.nextInt();
        System.out.println("Press 3 for Multiplication");
//        int num3 = sc.nextInt();
        System.out.println("Press 4 for Division");
        int num = sc.nextInt();

        switch(num){
            case 1:
                num = num1 + num2;
                System.out.println(num);
                break;
            case 2:
                num = num1 - num2;
                System.out.println(num);
                break;
            case 3:
                num = num1 * num2;
                System.out.println(num);
                break;
            case 4:
                num = num1 / num2;
                System.out.println(num);
                break;
        }




    }
}
