import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String low = "";
        String upper = "";
        
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());
        
        for(char ch : arr) {
            if(Character.isLowerCase(ch)) low += ch;
            else upper += ch;
        }
        answer = low + upper;
            
        return answer;
    }
}