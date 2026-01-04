package Java;
import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int rollno = ip.nextInt();
        System.out.println("Your Roll No. is : "+ rollno);

        // Sum of numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your Num2: ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        System.out.println("Sum of both Numbers is : "+sum);
    }
}