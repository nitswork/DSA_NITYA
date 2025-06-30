public class InagivenN {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)  // Check if last bit is 1
                count++;
            n >>= 1;  // Right shift by 1
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 13;
        System.out.println("Set bits in " + N + ": " + countSetBits(N));  // Output: 3
    }
}
