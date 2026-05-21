import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first num: ");
        int num1= input.nextInt();
        System.out.println("Enter second num: ");
        int num2= input.nextInt();

       int sum=num1+num2;
        System.out.println("sum = " +sum );
    }
}