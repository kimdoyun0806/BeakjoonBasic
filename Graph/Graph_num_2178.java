package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_num_2178 {
    public static boolean[][] visited;
    public static int[][] map;
    public static int N, M;
    public static final int[] dx = {-1, 1, 0, 0};
    public static final int[] dy = {0, 0, -1, 1};


    public static void bfs(int x, int y) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int cx = q.peek()[0];
            int cy = q.peek()[1];
            q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (0 > nx || 0 > ny || N <= nx || M <= ny)
                    continue;
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    q.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    map[nx][ny] = map[cx][cy] + 1;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                int num = Character.getNumericValue(str.charAt(j));
                map[i][j] = num;
            }
        }
        bfs(0, 0);
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if (!visited[i][j] && map[i][j] == 1) {
//                    bfs(i, j);
//                }
//            }
//        }
        System.out.println(map[N - 1][M - 1]);
    }
}
