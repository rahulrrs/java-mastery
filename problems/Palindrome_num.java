import java.util.Scanner;
public class Palindrome_num {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the digit: ");
        long num = sc.nextLong();
        isPalindrome(num);
    }
    public static void isPalindrome(long num) {
        long reverse = 0L;
        long number = num;
        while(number>0) {
            long digit = number%10;
            reverse = reverse*10+digit;
            number/=10;
        }
        if(num == reverse){
            System.out.println("Is Palindrome");
        }
        else{
            System.err.println("Not Palindrome");
        }
    }
}