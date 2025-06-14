public class SumofNnums{
    public static int checksum(int n) {
        int sum = 0;
        while(n>0){
            sum = (n*(n+1))/2;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        int res = checksum(n);
        System.out.println(res);
    }
}