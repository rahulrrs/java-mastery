import java.util.Scanner;
public class Fibonacci {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        isFibonacci(range);
    }
    public static void isFibonacci(int range) {
        int first = 0;
        int second = 1;
        if (range < 1) {
            System.out.println("Invalid");
        }
        else {
            if (range>=1) System.out.print(first+" ");
            if (range>=2) System.out.print(second+" ");
            for(int i = 3;i<=range;i++) {
                int fib = first+second;
                first = second;
                second = fib;
                System.out.print(fib+" ");
            }
        }
    }
}
