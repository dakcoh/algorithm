import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        }
        
        int min = Arrays.stream(arr).min().getAsInt();

        answer = Arrays.stream(arr)
                     .filter(item -> item != min)
                     .toArray();
        
        return answer;
    }
}