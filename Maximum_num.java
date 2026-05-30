package Firstjavaprogram;

import java.util.Scanner;
public class Maximum_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num");
        int a =sc.nextInt();

        System.out.println("Enter second num");
        int b =sc.nextInt();

        System.out.println("Enter third num");
        int c =sc.nextInt();

        int max = Math.max(c,Math.max(a,b));
        System.out.println("Maximum number is: " + max);

    }
}
