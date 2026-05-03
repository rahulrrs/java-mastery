import java.util.Scanner;
// without using Temp
public class Swap {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the First Number: ");
        long num1 = sc.nextLong();
        System.out.print("Enter the Second Number: ");
        long num2 = sc.nextLong();
        swap(num1, num2);
        
    }
    public static void swap(long num1, long num2) {
        // num1 = num1+num2;
        // num2 = num1-num2;
        // num1 = num1-num2;

        // XOR Method

        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.printf("Number 1: %d \nNumber 2: %d",num1,num2);
    }
}