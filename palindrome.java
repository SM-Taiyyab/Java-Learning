import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String a = in.nextLine();
        String rev = "";
        for (int i = a.length()-1; i >= 0; i--) {
            rev += a.charAt(i);
            System.out.println(rev);
        }

        if (a.equals(rev)) {
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("NOT PALINDROME");
        }



    }
}
