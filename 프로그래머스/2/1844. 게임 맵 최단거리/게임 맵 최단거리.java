import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    static int[] dx = {-1, 0, 1, 0};  // 상, 우, 하, 좌
    static int[] dy = {0, 1, 0, -1};
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visit = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[] {0,0});
        visit[0][0] = true;

        int[][] dist = new int[n][m];
        dist[0][0] = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(maps[nx][ny] == 0 || visit[nx][ny]) continue;


                visit[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
                q.offer(new int[]{nx,ny});
            }
        }
        answer = dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];

        return answer;
    }
}