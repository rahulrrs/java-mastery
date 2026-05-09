import java.util.Scanner;
public class Pattern8 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String args[]) {
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        hollowtriangle(range);
    }
    public static void hollowtriangle(int range) {
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j<=range-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=(i*2)-1;j++){
                if(i == range || j==1|| j==(i*2)-1) {
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