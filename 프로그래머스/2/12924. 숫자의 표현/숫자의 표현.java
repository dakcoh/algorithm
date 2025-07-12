class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * (i - 1) / 2 < n; i++) {
            int numerator = n - i * (i - 1) / 2;
            if (numerator % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}