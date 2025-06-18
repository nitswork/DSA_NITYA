public class ReverseBits {
    public static int reversebits(int n ){
        int res =0;
        for(int i =0; i<32 ; i++){
            res <<=1;
            if((n&1)== 1){
                res += 1;
            }
            n >>=1;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = reversebits(n);
        System.out.println(n);
        System.out.println("Reversed bits (as binary): " + Integer.toBinaryString(ans));
    }
}
