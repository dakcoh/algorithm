class Solution {
    public int solution(int n) {
        int answer = Integer.bitCount(n);

        while (true) {
            n++;
            if (Integer.bitCount(n) == answer) {
                return n;
            }
        }
    }
}