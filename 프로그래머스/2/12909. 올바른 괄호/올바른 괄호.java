import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(String.valueOf(s.charAt(i)));
            } else if (s.charAt(i) == ')'){
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.size() != 0) return false;
        return answer;
    }
}