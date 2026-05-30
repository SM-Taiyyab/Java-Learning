package Firstjavaprogram;

public class CountDigits {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("Total Digits: " + countDigits(num));
        System.out.println("sum of Digits: " + sum(num));
    }

        public static int countDigits(int num) {
        if (num == 0)
            return 1;

        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

        public static int sum(int num) {
        int total = 0;
        while (num != 0) {
            total = total + num % 10;
            num = num / 10;
        }
        return total;
    }

}

