import java.util.Scanner;
public class HollowSquarePattern {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        hollowsquare(range);
    }
    public static void hollowsquare(int range) {
        for (int i = 1; i <=range; i++) {
            for (int j = 1; j<=range; j++) {
                if (i==1||j==1||i==range||j==range) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
