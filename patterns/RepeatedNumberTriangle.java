import java.util.Scanner;

public class RepeatedNumberTriangle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        righttriangle(num);
    }
    public static void righttriangle(int num) {
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
