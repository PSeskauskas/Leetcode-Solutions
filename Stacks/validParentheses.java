class Solution {
    public boolean isValid(String s) {
        /* If the length of the string isn't even, then the parentheses cannot be valid */
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> brackets = new Stack<>();
        /* If the bracket is an opening bracket, push it to the stack, else, check if the stack isn't empty and pop the element and compare */
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                brackets.push(s.charAt(i));
            } else {
                if(brackets.empty() || s.charAt(i) == ')' && brackets.pop() != '(' || s.charAt(i) == ']' && brackets.pop() != '[' || s.charAt(i) == '}' && brackets.pop() != '{') {
                    return false;
                }
            }
        }
        /* If the stack still contains elements, then the parentheses weren't valid */
        if(!brackets.empty()) {
            return false;
        }
        return true;
    }
}
