package Recursion;
import java.util.Scanner;

public class SumofNnums{
    public static int checksum(int n) {
        int sum = 0;
        while(n>0){
            sum = (n*(n+1))/2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int res = checksum(n);
        System.out.println(res);
    }
}