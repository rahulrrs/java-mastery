import java.util.Scanner;
public class Pattern6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        Pyramid(num);
    }
    public static void Pyramid(int num) {
        for (int i = 1 ; i <= num; i++) {
            for (int j = 1; j<=num-i;j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i*2-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = num-1 ; i > 0; i--) {
            for (int j = 1; j<=num-i;j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i*2-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}