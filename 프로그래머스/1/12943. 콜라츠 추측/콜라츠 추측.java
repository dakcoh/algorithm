class Solution {
    public int solution(int num) {
        long answer = num;
        int count = 0;
        
        while (answer != 1 && count < 500) {
            if(answer % 2 == 0) {
                answer = answer / 2;
            } else {
                answer = answer * 3 + 1;
            }
            count++;
        }
        
        return answer == 1 ? count : -1;
    }
}