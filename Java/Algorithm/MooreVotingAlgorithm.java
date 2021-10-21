/**
 * The Boyer-Moore voting algorithm is one of the popular optimal algorithms
 * which is used to find the majority element among the given elements that have more than N/2 occurrences.
 * This works perfectly fine for finding the majority element which takes 2 traversals over the given elements,
 * which works in O(N) time complexity and O(1) space complexity.
 *
 * Time Complexity: O(n) (For two passes over the array )
 * Space Complexity: O(1)
 */
public class MooreVotingAlgorithm {
    // Java main method
    public static void main(String[] args)
    {
        int arr[] = { 1, 1, 1, 1, 2, 3, 4, 5, 5, 5, 5 };
        int majority = findMajority(arr);
        System.out.println(" The majority element is = "+ majority);
    }

    /**
     * Method to find majority element
     * @param nums
     * @return
     */
    public static int findMajority(int[] nums)
    {
        int count = 0, candidate = -1;

        // Finding majority candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                if (num == candidate)
                    count++;
                else
                    count--;
            }
        }

        // Checking if majority candidate occurs more than n/2 times
        for (int num : nums) {
            if (num == candidate)
                count++;
        }
        if (count > (nums.length / 2))
            return candidate;
        return -1;
    }

}
