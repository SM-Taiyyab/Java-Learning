package Learn_java;

public class New_forloop
{
    public static void main(String[] args)
    {
        int nums [] = new int[3];
        nums [0]= 4;
        nums [1]= 3;
        nums [2]= 2;

//      for (int i = 0; i< nums.length; i++) old loop
        {
//            System.out.println(nums[i]);
        }

        for (int n:nums)
        {
            System.out.println(n);
        }
    }
}
