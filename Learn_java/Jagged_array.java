package Learn_java;
//
//public class Jagged_array
//{
//    //error
//    public static void main(String[] args)
//    {
//        int nums [][] = new int[3][];
//
//        nums[0] = new int[2];
//        nums[1] = new int[3];
//        nums[2] = new int[4];
//
//        for (int i = 0; i < nums.length; i++)
//        {
//            for (int j = 0; j < nums[j].length; j++)
//            {
//                System.out.print(nums[i][j] + " ");
//            }
//
//            System.out.println();
//        }
//
//    }
//}


public class Jagged_array {
    public static void main(String[] args) {
        int nums[][] = new int[3][];

        nums[0] = new int[2]; // 2 elements
        nums[1] = new int[3]; // 3 elements
        nums[2] = new int[4]; // 4 elements

        // Initialize the jagged array with some values
        int value = 1; // just for demonstration
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = value++;
            }
        }

        // Print the jagged array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
