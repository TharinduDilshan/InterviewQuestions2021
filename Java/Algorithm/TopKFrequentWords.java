/*
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.

*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k)
    {
    	HashMap<String,Integer> h=new HashMap<String, Integer>();
    	for(String nums:words)
    		h.put(nums,h.getOrDefault(nums,0)+1);
    	//creating min heap
    	PriorityQueue<Map.Entry<String, Integer>> queue= new PriorityQueue<>(
    			Comparator.comparing(e->e.getValue()));
    	
    	for(Map.Entry<String, Integer> entry:h.entrySet())
    	{
    		queue.offer(entry);
    		if(queue.size()>k)
    			queue.poll();
    	}
    	List<String> res= new ArrayList<String>();
    	while(!queue.isEmpty())
    	{
    		res.add(queue.poll().getKey());
    	}
    	Collections.reverse(res);
    	return res;
    }