package Learn_java;

class Add
{
    public int add(int n1, int n2, int n3)

    {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}




public class Mehtod_overloading
{
    public static void main(String[] args)
    {
        Add three = new Add();
        int r1 = three.add(5,3,5);
        System.out.println(r1);

    }
}
