import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter radius");
        int radius = input.nextInt();

        float c = 3.14f;
        float area = radius * radius * c;

        System.out.println("Area of circle is: " + area);



    }
}
