class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] num = String.valueOf(x).split("");
        for (int i=0; i<num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }

        answer = x % sum == 0 ? true : false;
        return answer;
    }
}