package arrays;

import java.util.Scanner;

public class SumOfArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++) {
            System.out.printf("Enter the array element %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
