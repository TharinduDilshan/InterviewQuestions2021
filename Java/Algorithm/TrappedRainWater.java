/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9

 */



import java.util.Scanner;

public class TrappedRainwater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        int i = checkTrapWater(heights);
        System.out.println(i);

    }

    private static int checkTrapWater(int[] heights) {
        int res = 0;
        int start = 0;
        int end = heights.length - 1;
        while(start < end){
            if(heights[start] <= heights[end]){
                int curr = heights[start];
                while (heights[++start] < curr)
                    res += curr - heights[start];
            }else{
                int curr = heights[end];
                while(heights[--end] < curr)
                    res += curr - heights[end];
            }
        }
        return res;
    }
}
