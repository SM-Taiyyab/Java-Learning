package Firstjavaprogram;

public class Counting_occur {
    public static void main(String[] args) {

        int num = 1355539;

        int count = 0;
        while(num>0){
            int rem = num % 10;
            if (rem == 5 || rem == 9){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }

}
