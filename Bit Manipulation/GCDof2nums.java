
import java.util.Scanner;

public class GCDof2nums {
    public int calc(int a , int b ){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1= sc.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = sc.nextInt();
        GCDof2nums one = new GCDof2nums();
        int ans = one.calc(num1, num2);
        System.out.println("GCD of ("+ num1+ "," + num2 +") is : " +ans);
    }
}
