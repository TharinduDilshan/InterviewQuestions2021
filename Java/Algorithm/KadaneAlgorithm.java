/**
 * Initialize:
 *     max_so_far = INT_MIN
 *     max_ending_here = 0
 *
 * Loop for each element of the array
 *   (a) max_ending_here = max_ending_here + a[i]
 *   (b) if(max_so_far < max_ending_here)
 *             max_so_far = max_ending_here
 *   (c) if(max_ending_here < 0)
 *             max_ending_here = 0
 * return max_so_far
 *
 * Time Complexity: O(n)
 * Auxiliary Space: O(1)
 */
public class KadaneAlgorithm {
    //Java Main method
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }

    /**
     * Return max contiguous sum of array
     * @param a
     * @return
     */
    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}

