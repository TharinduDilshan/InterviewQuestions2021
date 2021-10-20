/**
 * You are given N items. Each item has a weight and a value associated with it.
 * You are given a bag which can hold a maximum weight of W.
 * Please arrange the items in such a way that you get maximum value and the weight of the bag is less than or equal to W.
 *
 * Items:
 * Item 1: Weight = 10; Value: 50
 * Item 2: Weight = 20; Value: 40
 * Item 3: Weight = 30; Value: 100
 * Item 4: Weight = 20; Value: 120
 *
 * Maximum Weight W = 60
 *
 * Time Complexity: O(2n)
 * Auxiliary Space :O(1)
 */
public class KnapSackBruteForce {
    /**
     * Method to return max of two numbers
     * @param a
     * @param b
     * @return
     */
    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    /**
     * Returns maximum value the bag can hold
     * @param W
     * @param wt
     * @param val
     * @param n
     * @return
     */
    static int knapSack(int W, int wt[], int val[], int n)
    {
        //If W is zero, then skip it
        if (n == 0 || W == 0)
            return 0;


        //If weight of the incoming item is more than the capacity, exclude it
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
        else // Max of - nth item included or not includes
            return max(val[n - 1]
                            + knapSack(W - wt[n - 1], wt,
                            val, n - 1),
                    knapSack(W, wt, val, n - 1));
    }

    /**
     * Java main method
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