import java.util.Scanner;

public class PalindromeString {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        if(ispalindrome(text)) {
            System.out.println("Is a Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
    public static boolean ispalindrome(String text) {
        String reverse ="";
        for(int i = text.length()-1; i>=0 ; i--) {
            reverse += text.charAt(i);
        }
        return text.equals(reverse);
    }
}