package KthBits;
import java.util.Scanner;

public class LSBasLastBit{
    public static boolean checklsb(int n, int k){
        int num = (1 << (k - 1));
        while(n>0){
            int res = (n&num) ;
            if(res !=0 ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter the Bit Number from LSB (1-based): ");
        int k = sc.nextInt();
        boolean ans = checklsb(n, k);
        if(k==1){
            System.out.println("Is the " + k + "st bit from LSB set? " + ans);
        }
        if(k==2){
            System.out.println("Is the " + k + "nd bit from LSB set? " + ans);
        }
        if(k==3){
            System.out.println("Is the " + k + "rd bit from LSB set? " + ans);
        }
        else if(k>3){
            System.out.println("Is the " + k + "th bit from LSB set? " + ans);
        }
}
}