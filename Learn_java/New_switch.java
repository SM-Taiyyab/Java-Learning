package Learn_java;

public class New_switch
{
    public static void main(String[] args)
    {
        String day = "Monday";
        String result = "";

        result = switch(day)
        {
            case "Saturday", "Sunday" -> "6 am";
            case "Monday" ->  "7 am";
            default ->  "8 am";
        };

        System.out.println(result);
    }
}
