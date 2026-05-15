import java.util.Scanner;

public class FloydsTriangle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        floyds_triangle(range);
    }
    public static void floyds_triangle(int range) {
        int count = 1;
        for (int i = 1; i<=range; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
