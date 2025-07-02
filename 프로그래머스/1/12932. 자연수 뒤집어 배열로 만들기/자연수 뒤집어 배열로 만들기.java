class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String str = new StringBuilder(String.valueOf(n)).reverse().toString();
        answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(i) - '0';
        }
        
        return answer;
    }
}