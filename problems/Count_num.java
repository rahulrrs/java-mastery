import java.util.Scanner;
public class Count_num {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        count(num);
    }
    public static void count(long num) {
        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println("Count: "+count);
    }
}
