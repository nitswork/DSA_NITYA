package Java;

import java.util.Scanner;

public class Typecasting {

    public static void main(String[] args) {
        // int to float (as float > int)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num = sc.nextFloat();
        System.out.println("Your Float Number: "+ num);
        // float to int -> not working (as int < float)
        // Narrowing conversion  (Type Casting)
        int numb = (int) (20.2f);
        System.out.println("Float to Int:");
        System.out.println(numb);
        // automatic type promotion in expressions
        int a = 257; // 257 % 256 = 1
        byte b =(byte) (a);
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f =( c * d )/ e; // they act as int itself while being multiplied
        System.out.println(f);

        //will not work
        // byte x = 50;
        // x = x*2 ;

        int x = 'A';
        System.out.println(x);
        //give ASCI Value
        System.out.println("नमस्ते");//unicode

        byte y = 42;
        char ch = 'a';
        short s = 1024;
        int i = 5000;
        float ff = 5.67f;
        double dd = 0.1234;
        double res = (ff*y)+(i/ch) - (dd-s);
        System.out.println((ff*y)+" " +(i/ch) + " "+ (dd-s));
        System.out.println(res);
    }
}