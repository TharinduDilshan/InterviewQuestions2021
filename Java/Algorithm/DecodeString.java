/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
*/

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s)
    {
    	Stack<Integer> counts= new Stack<Integer>();
    	Stack<String> result= new Stack<String>();
    	String res="";
    	int i=0;
    	
    	while(i<s.length())
    	{
    		if(Character.isDigit(s.charAt(i)))
    		{
    			int cnt= 0;
    			while(Character.isDigit(s.charAt(i)))
    			{
    				cnt= cnt*10 + (s.charAt(i)-'0');
    				i++;
    			}
    			counts.push(cnt);
    		}
    		else if(s.charAt(i)=='[')
    		{
    			result.push(res);
    			res= "";
    			i++;
    		}
    		else if(s.charAt(i)==']')
    		{
    			StringBuilder str= new StringBuilder(result.pop());
    			int cnt= counts.pop();
    			for(int ind=0; ind<cnt; ind++)
    			{
    				str.append(res);
    			}
    			res= str.toString();
    			i++;
    		}
    		else
    		{
    			res+= s.charAt(i);
    			i++;
    		}
    		
    	}
    	return res;
    }
}

