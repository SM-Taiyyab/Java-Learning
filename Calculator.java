package Learn_java;

class Math
{
 public int add(int n1,int n2)
    {
        int r = n1 + n2;
        return r;

    }
}

public class Calculator
{
    public static void main(String[] args)
    {

        int num1 = 5;
        int num2 = 6;

        Math cal = new Math();

        int r = cal.add(num1, num2);
        System.out.println(r);
    }
}


