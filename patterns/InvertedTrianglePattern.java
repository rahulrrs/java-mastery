import java.util.Scanner;

public class InvertedTrianglePattern {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        revtriangle(num);
    }
    public static void revtriangle(int num) {
        for (int i = num ; i > 0 ; i--) {
            for (int j = 0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
