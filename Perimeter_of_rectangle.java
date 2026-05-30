package Firstjavaprogram;
import java.util.Scanner;


public class Perimeter_of_rectangle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lenght of rectangle");
        int Lenght =sc.nextInt();

        System.out.println("Enter width of rectangle");
        int width =sc.nextInt();

        int perimeter = 2*(Lenght + width);

        System.out.println("Perimeter is: " + perimeter);
    }
}
