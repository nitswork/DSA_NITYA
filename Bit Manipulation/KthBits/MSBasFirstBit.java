package KthBits;
import java.util.Scanner;

public class MSBasFirstBit {
    public static boolean isKthBitset(int n, int k){
        int msb =-1;
        int temp =n;
        while(temp>0){
            msb++;
            temp = temp>>1;
        }
        int msbVal = msb -k+1;
        if(msbVal < 0) return false;
        return (n&(1<< msbVal))!=0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter the Bit Number from MSB (1-based): ");
        int k = sc.nextInt();
        boolean ans = isKthBitset(n, k);
        if(k==1){
            System.out.println("Is the " + k + "st bit from MSB set? " + ans);
        }
        if(k==2){
            System.out.println("Is the " + k + "nd bit from MSB set? " + ans);
        }
        if(k==3){
            System.out.println("Is the " + k + "rd bit from MSB set? " + ans);
        }
        else if(k>3){
            System.out.println("Is the " + k + "th bit from MSB set? " + ans);
        }

    }
}
