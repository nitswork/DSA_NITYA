import java.util.Scanner;
public class Powerof2 {
    public static boolean ispower(int n){
        if(n<=0) return false;
        return (n & (n-1)) ==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean ans = ispower(num);
        System.out.println("Is " +num+ " a power of two? " + ans);
    }
}