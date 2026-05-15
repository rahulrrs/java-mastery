package basics;

public class Output {
    public static void main() {
        int a = 10;
        float b = 21.112f;
        double c = 3232.232;
        char d = 's';
        String e = "rayzen";
        boolean f = true;
        System.out.println("Hello World!");
        System.err.println("Error!"); //print error message
        //printing using format printer
        System.out.printf("Number: %d \nFloat: %.2f \nDouble: %.3f \nCharacter: %c\n",a,b,c,d); 
        System.out.printf("Name: %s\n", e);
        System.out.printf("True/false: %b\n", f);
        System.out.print("Hi World!\n"); //No newline created
        System.out.println(3+(3*5));
    }
}
