class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++) {
            answer += signs[i] == true ? Math.abs(absolutes[i]) : absolutes[i] * -1;
        }
        return answer;
    }
}