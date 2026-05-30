package Firstjavaprogram;
import java.util.Scanner;

public class Type_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any letter");
        char c =in.next().charAt(0);

        if (c >= 'a' &&  c <= 'z') {
            System.out.println("lower case :     " + c);
        }
        else
            System.out.println("upper case :"+c);

        }

}
