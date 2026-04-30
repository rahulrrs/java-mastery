import java.util.Scanner;
public class AreaOfRect {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int length, width;
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextInt();
        area(length, width);
    }
    public static void area (int length, int width) {
        int area = length*width;
        System.out.println("The Area of Rectangle is "+area);
    }
}