/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
    	Arrays.sort(nums);
    	List<List<Integer>> res= new ArrayList<List<Integer>>();
    	//We first convert a 4 sum to 3 sum problem
    	for(int i=0; i<nums.length-3; i++)
    	{
    		//Handling duplicates
    		if(i!=0 && nums[i]==nums[i-1]) continue;
    		//Converting to 3sum
    		for(int j=i+1; j<nums.length-2; j++)
    		{
    			//Handling the duplicates
    			if(j!=i+1 && nums[j]==nums[j-1]) continue;
    			
    			//Using the 2 sum method to solve
    			int left= j+1;
    			int right= nums.length-1;
    			
    			while(left < right)
    			{
        			int sum=nums[i]+nums[j]+nums[left]+nums[right];
        			
        			if(sum < target) left++;
        			else if(sum > target) right--;
        			else
        			{
        				//We found the sum
        				res.add(Arrays.asList(nums[i],nums[j], nums[left], nums[right]));
        				left++;
        				right--;
        				
        				//Handling the duplicates
        				while(left <right && nums[left]==nums[left-1]) left++;
        				while(left <right && nums[right]==nums[right+1]) right--;
        			}
        				
    			}
    		}
    	}
    	return res;
    }
}
