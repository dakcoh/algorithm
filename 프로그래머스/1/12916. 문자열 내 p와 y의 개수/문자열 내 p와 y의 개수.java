class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int num_p = 0;
        int num_y = 0;
        char[] num = s.toUpperCase().toCharArray();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 'P') {
                num_p += 1;
            } else if (num[i] == 'Y') {
                num_y += 1;
            }
        }

        answer = num_p == num_y;

        return answer;
    }
}