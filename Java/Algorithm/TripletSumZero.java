/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
*/

import java.util.Arrays;
import java.util.HashSet;
public class TripletsSumZero 
{
	public static void main(String[] args) {

		int[] arr=new int[] {-1, 2, 1, -4};
		int target=1;
		System.out.println(sum(arr,target));
	}

	private static int sum(int[] arr,int target) {
		int n=arr.length;
		int orig=target;
		Arrays.sort(arr);
		System.out.println(arr);
		int ans=Integer.MIN_VALUE;
		boolean find=false;
		for(int i=0; i<n-2; i++)
		{
			HashSet<Integer> s= new HashSet<Integer>();
			for(int j=i+1; j<n-1; j++)
			{
				int x=target-(arr[i]+arr[j]);
				if(s.contains(x))
				{
					ans=target;
					System.out.println(ans);
					break;
				}
				else
				{
					s.add(arr[j]);
					target++;
					System.out.println(target);
				}
			}
		}
		return ans;
	}
}
