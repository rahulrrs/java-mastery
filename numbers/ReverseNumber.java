package numbers;

import java.util.Scanner;
public class ReverseNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the digit: ");
        long num = sc.nextLong();
        reverse(num);
    }
    public static void reverse(long num) {
        long reverse = 0L;
        while(num>0) {
            long digit = num%10;
            reverse = reverse*10+digit;
            num/=10;
        }
        System.out.println("Reversed number: "+reverse);
    }
}
