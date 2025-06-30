
public class Inagivenrange {
    public static int countTotalSetBits(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += countSetBits(i);
        }
        return total;
    }

    // Reuse the method from part (a)
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1)
                count++;
            num >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 3;
        System.out.println("Total set bits from 1 to " + N + ": " + countTotalSetBits(N));  // Output: 4
    }
}
