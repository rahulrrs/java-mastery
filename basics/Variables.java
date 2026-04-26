

public class Variables{
    public static void main(String[] args){
        //types of datatypes
        int a =12;
        long b = 2432424234324234L;
        float c=12.43f;
        double d = 2123.2313213;
        char e = 'a';
        String f = "rayzen";
        boolean g = true;
        int x =4,y=6;
        final int myNum = 20;
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+x+"\n"+y);
        System.out.println(myNum);
        char ch = 'r';
        int conv = (int)ch;
        System.out.println(conv);
        String firstname = "Rayzen";
        String lastname = "Tempest";
        String fullname = firstname+lastname;
        System.out.println(fullname);
        String text = "I am ";
        int age = 21;
        String text2 = " Years old";
        String fulltext = text+age+text2;
        System.out.println(fulltext);
        char alphabet = 'q';
        int number = 2;
        int combine = alphabet+number;
        System.out.println(combine);
    }
}