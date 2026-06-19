import java.util.Scanner;

public class ReverseString {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        System.out.print(reverse(text));
    }
    public static String reverse(String text) {
        String reverse ="";
        for(int i = text.length()-1; i>=0 ; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }
}