package Recursion;
import java.util.Scanner;

public class ComputePowof2 {
    public static int powof2(int n, int m){
        if(m==0) return 1;
        return n*powof2(n,m-1);
    }
    public static void main(String[] args) {
        int m = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power: ");
        int  n = sc.nextInt();
        int ans = powof2(n,m);
        System.out.println(ans);
    }
}
