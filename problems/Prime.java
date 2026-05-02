import java.util.Scanner;
public class Prime {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        isprime(num);
    }
    public static void isprime(long num) {
        boolean prime = true;
        if(num <= 1){
            System.out.printf("The number %d is not a prime number.",num);
            return;
        }
        for(int i = 2;i<=num/2;i++) {
            if(num%i == 0) {
                prime = false;
                break;
            }
            else{
                prime = true;
            }
        }
        if (prime) {
            System.out.printf("The number %d is a prime number.",num);
        }
        else {
            System.out.printf("The number %d is not a prime number.",num);
        }
    }
}