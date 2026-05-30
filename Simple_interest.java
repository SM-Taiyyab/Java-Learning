import java.util.Scanner;

public class Simple_interest {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Principle");
        int p = in.nextInt();

        System.out.println("Enter time");
        int t = in.nextInt();

        System.out.println("Enter number of rate");
        int r = in.nextInt();

        int simple_interest = (p * t * r)/ 100;
        System.out.println(simple_interest);
    }
}
