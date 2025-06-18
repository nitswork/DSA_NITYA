import java.util.Scanner;

public class Uniquenum {
    public static int Uniquenumebr(int arr[]){
        int res =0;
        for(int i: arr){
            res ^= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements: ");
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int ans = Uniquenumebr(arr);
        System.out.println("Unique Number: "+ans);
        sc.close();
    }
}
