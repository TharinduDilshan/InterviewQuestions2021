/*
Problem:
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
 */


class ValidParantheses {

    public boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && ch == '}' && stack.peek() == '{')
                stack.pop();
            else if(!stack.isEmpty() && stack.peek() == '(' && ch == ')')
                stack.pop();
            else if(!stack.isEmpty() && stack.peek() == '[' && ch == ']')
                stack.pop();
            else
                stack.push(ch);

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        System.out.println(isValid(input));
    }
}
