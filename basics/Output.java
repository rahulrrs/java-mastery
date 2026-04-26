public class Output  {
    public static void main(String[] args) {
        int a = 12;
        String s = "sad";
        boolean b = true;
        char c = 'c';
        float f = 12121.3435f;
        double d = 3432423.4324324;
        System.out.println("Hello World!");
        System.err.println("Something went wrong");
        System.out.printf("Integer: %d\n", a);
        System.out.printf("String: %s\n",s);
        System.out.printf("Char: %c\n",c);
        System.out.printf("Float: %.2f\n",f);
        System.out.printf("Double: %f\n",d);
        System.out.printf("Boolean: %b\n", b);
    }
}