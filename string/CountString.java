import java.util.Scanner;

public class CountString {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Number 1 - Count vowels");
        System.out.println("Number 2 - Count Words");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        switch (number) {

            case 1:
                countVowels(text);
                break;

            case 2:
                countWords(text);
                break;

            default:
                System.out.println("Invalid");
        }
    }

    public static void countVowels(String text) {

        int count = 0;

        text = text.toLowerCase();

        for(int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Vowels Count: " + count);
    }

    public static void countWords(String text) {

        int count = 1;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Word Count: " + count);
    }
}