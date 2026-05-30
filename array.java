package Learn_java;

public class array
{
    public static void main(String[] args)
    {
//      int nums [] = {1,2,3,4};
      int nums [] = new int[4];// another way of initialize
      nums[0] = 5;
      nums[1] = 4;
      nums[2] = 3;

      for(int i = 0; i <= 3; i++)
          System.out.println(nums[i]);
    }
}
