import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 0, 1, 0};  // 상, 우, 하, 좌
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visit;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        Queue<int[]> q = new LinkedList<>();

        map = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            tk = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(tk.nextToken());
            }
        }

        int max = 0;
        int num = 0;

        // 전체 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0 || visit[i][j]) continue;

                num++;
                int area = 0;
                visit[i][j] = true;
                q.offer(new int[]{i, j});

                while (!q.isEmpty()) {
                    area++;
                    int[] temp = q.poll();
                    int x = temp[0];
                    int y = temp[1];

                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue; // 범위 벗어나면 무시
                        if (visit[nx][ny] || map[nx][ny] != 1) continue;      // 이미 방문했거나 0이면 무시

                        visit[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }

                max = Math.max(max, area);
            }
        }
        System.out.println(num);
        System.out.println(max);
    }
}