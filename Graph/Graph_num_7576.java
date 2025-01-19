package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.StreamSupport;

public class Graph_num_7576 {
    public static Queue<int[]> q = new ArrayDeque<>();
    public static final int[] dx = {-1, 1, 0, 0};
    public static final int[] dy = {0, 0, -1, 1};
    public static int[][] map;
    public static int N, M;
    public static int cnt = 0;

    public static void bfs() {
        while (!q.isEmpty()) {
            int x = q.peek()[0];
            int y = q.peek()[1];
            q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || ny < 0 || nx >= N || ny >= M)
                    continue;
                if (map[nx][ny] == 0) {
                    map[nx][ny] = map[x][y] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1)
                    q.offer(new int[]{i, j});
            }
        }

        bfs();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 익지 않은 토마토가 하나라도 있다면
                if (map[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                cnt = Math.max(cnt, map[i][j]);
            }
        }
        System.out.println(cnt-1);
    }
}
