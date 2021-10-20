/**
 * You are given N items. Each item has a weight and a value associated with it.
 * You are given a bag which can hold a maximum weight of W.
 * Please arrange the items in such a way that you get maximum value and the weight of the bag is less than or equal to W.
 * <p>
 * Items:
 * Item 1: Weight = 10; Value: 50
 * Item 2: Weight = 20; Value: 40
 * Item 3: Weight = 30; Value: 100
 * Item 4: Weight = 20; Value: 120
 * <p>
 * Maximum Weight W = 60
 * <p>
 * Time Complexity: O(N*W)
 * Auxiliary Space: O(N*W)
 */
public class KnapSackMemoization {
    /**
     * Method to return max of two numbers
     *
     * @param a
     * @param b
     * @return
     */
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Returns maximum value the bag can hold
     *
     * @param W
     * @param wt
     * @param val
     * @param n
     * @return
     */
    static int knapSackRec(int W, int wt[], int val[], int n, int[][] dp) {

        //If W is zero, then skip it
        if (n == 0 || W == 0)
            return 0;

        if (dp[n][W] != -1)
            return dp[n][W];

        if (wt[n - 1] > W)// Store the value in table
            return dp[n][W] = knapSackRec(W, wt, val,
                    n - 1, dp);

        else // Sort and return the value
            return dp[n][W] = max((val[n - 1] +
                            knapSackRec(W - wt[n - 1], wt,
                                    val, n - 1, dp)),
                    knapSackRec(W, wt, val,
                            n - 1, dp));
    }

    static int knapSack(int W, int wt[], int val[], int N) {
        // Dynamically create the table
        int dp[][] = new int[N + 1][W + 1];

        // Pre-populate the table with -1
        for (int i = 0; i < N + 1; i++)
            for (int j = 0; j < W + 1; j++)
                dp[i][j] = -1;

        return knapSackRec(W, wt, val, N, dp);
    }

    /**
     * Java main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int val[] = {50, 40, 100, 120};
        int wt[] = {10, 20, 30, 40};

        int W = 60;
        int N = val.length;

        System.out.println("The maximum value the bag can hold is " +knapSack(W, wt, val, N));
    }
}

