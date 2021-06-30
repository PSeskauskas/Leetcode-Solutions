class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(':
                    stack.push(s.charAt(i));
                    break;
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if(stack.isEmpty()) {
                        return false;
                    }
                    else if(stack.pop() != '(') {
                        return false;
                    } 
                    break;
                case ']':
                    if(stack.isEmpty()) {
                        return false;
                    }
                    else if(stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty()) {
                        return false;
                    }
                    else if(stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
