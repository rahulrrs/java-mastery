package numbers;

import java.util.Scanner;
public class ArmstrongNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        isamstrongnum(num);
    }
    public static void isamstrongnum(long num) {
        long original = num;
        long temp = num;
        long result = 0;
        long count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        while(temp>0) {
            long digit = temp%10;
            result+= (long)Math.pow(digit, count);
            temp/=10;
        }
        if (original == result) {
            System.out.printf("The number %d is Amstrong number.",original);
        }
        else{
            System.err.println("Not a Amstrong Number");
        }
    }
}
