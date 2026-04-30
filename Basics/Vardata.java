public class Vardata {
    public static void main(String[] args){
        final int a = 10; //if final keyword is used variable value cant be changed and becomes constant
        float b = 21.112f;
        double c = 3232.232;
        char d = 's';
        String e = "rayzen";
        boolean f = true;
        long g = 4823904823L;
        char n1 = 76 , n2 =71, n3 =54;
        int x = 2, y = 3, z = 10;
        System.out.printf("Number: %d \nFloat: %.2f \nDouble: %.3f \nCharacter: %c\n",a,b,c,d); 
        System.out.printf("Name: %s\n", e);
        System.out.printf("True/false: %b\n", f);
        System.out.println("Sum: "+ (x+y+z));
        System.out.println("Long: "+g);
        System.out.println("Printing Characters using number: "+n1+","+n2+","+n3);
    }
}
