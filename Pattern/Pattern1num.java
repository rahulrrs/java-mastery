import java.util.Scanner;

public class Pattern1num {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        lefttriangle(num);
    }
    public static void lefttriangle(int num) {
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}