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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Queue<int[]> q = new LinkedList<>();

        map = new int[n][m];
        boolean[][] visit = new boolean[n][m];
        int[][] dist = new int[n][m];

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            for(int j=0; j<m; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        q.offer(new int[]{0,0});
        visit[0][0] = true;
        dist[0][0] = 1;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                visit[i][j] = true;
                q.offer(new int[]{i,j});

                while(!q.isEmpty()) {
                    int[] temp = q.poll();
                    int x = temp[0];
                    int y = temp[1];

                    for(int dir=0; dir<4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if(nx<0 || ny <0 || nx >= n || ny >= m) continue;
                        if(map[nx][ny] == 0 || visit[nx][ny]) continue;

                        visit[nx][ny] = true;
                        dist[nx][ny] = dist[x][y] + 1;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
        System.out.println(dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1]);
    }
}