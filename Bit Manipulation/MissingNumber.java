import java.util.Scanner;
public class MissingNumber {
    public static int missingnum(int arr[]){
        int n = arr.length;
        // int sum =0;
        // int actualsum = 0;
        // sum = (n*(n+1))/2;
        // for(int i =0; i<n ; i++){
        //     actualsum += arr[i];
        // }
        // return sum -actualsum;
        int res=0;
        for(int i =0; i<n; i++){
            res ^=i;
            res^=arr[i];
        }
        res^= n;
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
        int ans = missingnum(arr);
        System.out.println("Missing Number is : "+ans);
    }
}
