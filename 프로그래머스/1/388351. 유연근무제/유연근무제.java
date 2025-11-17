import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int[] maxTime = new int[schedules.length];

        for(int i=0; i<schedules.length; i++) {
            int hour = schedules[i] / 100;
            int min = schedules[i] % 100;
            min += 10;
            if(min >= 60)  {
                hour++;
                min -= 60;
            }
            maxTime[i] = hour * 100 + min;
        }

        for(int i=0; i < timelogs.length; i++) {
            int count = 0;
            for(int j=0; j < timelogs[i].length; j++) {
                int st = (startday + j) % 7;

                if (st == 0 || st == 6) continue;
                if(timelogs[i][j] <= maxTime[i]) {
                    count += 1;
                }

            }
            if(count == 5) answer += 1;
        }
        return answer;
    }
}