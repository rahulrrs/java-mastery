package numbers;

import java.util.Scanner;
public class SumOfDigits {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the digit: ");
        long num = sc.nextLong();
        sum(num);
    }
    public static void sum(long num) {
        int sum = 0;
        while(num>0) {
            long digit = num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("Sum: "+sum);
    }
}
