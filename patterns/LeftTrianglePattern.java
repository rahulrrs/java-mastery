import java.util.Scanner;

public class LeftTrianglePattern {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        righttriangle(num);
    }
    public static void righttriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
