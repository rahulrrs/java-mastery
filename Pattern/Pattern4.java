import java.util.Scanner;

public class Pattern4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        righttriangle(num);
    }
    public static void righttriangle(int num) {
        for (int i = 1 ; i <=num; i++) {
            for (int j = 1; j<=num-i;j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}