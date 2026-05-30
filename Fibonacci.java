import java.util.Enumeration;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num) {
            int temp = b; /* 1   1   2   3  5*/
            b = b + a;    /* 1   2   3   5  8 */
            a = temp;      /*1   1   2   3  5 */
            count++;       /*3   4  5   6  7 */

        }
        System.out.println(b);
    }
}