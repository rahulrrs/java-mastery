import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        factorial(num);
    } 

    public static void factorial(int num) {
        if (num < 0) {
            System.out.println("Invalid");
            return;
        }

        if (num == 0) {
            System.out.println("Factorial: 1");
            return;
        }

        long fact = 1;

        while (num > 0) { 
            fact *= num;
            num--;
        }

        System.out.println("Factorial: " + fact);
    }
}