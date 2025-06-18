package Recursion;
import java.util.*;

public class Fibo {
    public static int Fibonacci(int n){
        if(n ==0 || n ==1) return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args) {
    System.out.println("Enter number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = Fibonacci(n);
    System.out.println("Number is : "+ans);
    }
}
