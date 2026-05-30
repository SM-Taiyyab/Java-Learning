import java.util.Scanner;

public class Greetings {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name");
        String name = in.nextLine();
        if (name.equals("Taiyyab") || name.equals("Umer")) {
            System.out.println("hello " + name);
        }
        else{
            System.out.println("Wrong name");
        }
    }
}
