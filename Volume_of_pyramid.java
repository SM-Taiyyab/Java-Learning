package Firstjavaprogram;

import java.util.Scanner;
public class Volume_of_pyramid {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of pyramid ");
        int l = in.nextInt();

        System.out.println("Enter width of pyramid ");
        int w = in.nextInt();

        System.out.println("Enter height of pyramid ");
        int h = in.nextInt();

        double volume = l*w*h/3.0;



        System.out.println(volume);

    }
}

