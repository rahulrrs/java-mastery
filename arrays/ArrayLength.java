package arrays;

import java.util.Scanner;

public class ArrayLength {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("[");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
}

