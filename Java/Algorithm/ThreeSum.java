/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);	//because we want our pointers to move efficiently
        List<List<Integer>> res= new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++)
        {
        	if(i==0 || (i>0 && nums[i]!= nums[i-1]))//see if there are no duplicates
        	{
        		int low= i+1;
        		int high= nums.length-1;
        		int sum=0-nums[i];
        		
        		while(low<high)
        		{
        			if(nums[low]+nums[high]==sum)
        			{
        				res.add(Arrays.asList(nums[i], nums[low], nums[high]));
        				while(low<high && nums[low]==nums[low+1])	//handling duplicates
        					low++;
        				while(low<high && nums[high]==nums[high-1])		//handling duplicates
        					high--;
        				
        				low++;
        				high--;
        			}
        			else if(nums[low]+nums[high]>sum)
        			{
        				high--;
        			}
        			else
        				low++;
        		}
        	}
        }
        return res;
    }
}
