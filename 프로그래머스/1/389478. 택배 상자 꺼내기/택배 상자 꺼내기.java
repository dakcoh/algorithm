import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int rows = (n + w - 1) / w;
        int[][] arr = new int[rows][w];

        int cur = 1;

        for(int i=0; i< rows && cur <=n; i++) {
            if(i % 2 == 0) {
                for(int j=0; j < w && cur <= n; j++) arr[i][j] = cur++;
            } else {
                for(int j=w-1; j >= 0 && cur <= n; j--) arr[i][j] = cur++;
            }
        }

        int tr = -1, tc = -1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < w; c++) {
                if (arr[r][c] == num) { tr = r; tc = c; }
            }
        }
        int count = 0;
        for (int r = tr; r < rows; r++) if (arr[r][tc] != 0) count++;

        answer = count;
        return answer;
    }
}