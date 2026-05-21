package Learn_java;

public class twoD_array
{
    public static void main(String [] args)
    {
        int nums [][] = new int[3][4];

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

    }
}
