package Learn_java;

public class Old_switch
{
    public static void main(String[] args)
    {
       int x=1;

       switch (x)
      {
          case 1:
            System.out.println("Monday");
           break;
          case 2:
            System.out.println("tueday");
          break;
          case 3:
            System.out.println("wednesday");
            break;
            case 4:
           System.out.println("thursday");
           break;
           case 5: System.out.println("Friday");

           case 6:
           System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
           default:
               System.out.println("Enter a valid number");
      }
    }
}

