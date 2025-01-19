package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;


public class Graph_num_7562 {
    public static boolean[][] visited;
    public static int[][] map;
    public static int l;
    public static final int[] dx = {-1, -2, 1, 2, -2, -1, 2, 1};
    public static final int[] dy = {2, 1, 2, 1, -1, -2, -1, -2};

    public static void bfs(int x, int y) {
        Queue<int[]> q = new ArrayDeque<>();
        visited[x][y] = true;
        q.offer(new int[]{x, y});

        while (!q.isEmpty()) {
            int cx = q.peek()[0];
            int cy = q.peek()[1];
            q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= l || ny >= l)
                    continue;

                if (!visited[nx][ny]) {
                    q.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    map[nx][ny] = map[cx][cy] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); //테스트 케이스
        while (T-- > 0) {
            l = Integer.parseInt(br.readLine()); // 체스판 변의 길이
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 현재 나이트의 위치
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            // 이동하려는 나이트의 위치
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            visited = new boolean[l][l];
            map = new int[l][l];

            bfs(startX, startY);
            sb.append(map[endX][endY] + "\n");
        }
        System.out.println(sb);
    }
}

