package Firstjavaprogram;
//
//public class Reverse_num {
//    public static void main(String[] args) {
//        int [] arr = {2,3,5,9,7};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print((arr[i]));
//
//        }
//
//    }
//
 // palindrome
public class Reverse_num {
    public static void main(String[] args) {
        int n = 23597;
        int ans =0;

        while(n>0){
             int rem = n%10;
             ans = ans * 10 + rem;
             n /= 10;


        }
        System.out.println(ans);
    }
}