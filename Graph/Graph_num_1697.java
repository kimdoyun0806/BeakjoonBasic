package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_num_1697 {
    public static boolean[] visited = new boolean[100001];
    public static Queue<Integer> q = new ArrayDeque<>();
    public static int[] map = new int[100001];
    public static int[] dx = {-1, 1, 2};
    public static int nx;

    public static void bfs(int x) {
        q.offer(x);
        visited[x] = true;

        while (!q.isEmpty()) {
            int cx = q.poll();
            for (int i = 0; i < 3; i++) {
                if (i == 2) {
                    nx = cx * dx[i];
                }
                else {
                    nx = cx + dx[i];
                }
                if (nx < 0 || nx >= 100001)
                    continue;
                if (!visited[nx] && map[nx] == 0) {
                    q.offer(nx);
                    visited[nx] = true;
                    map[nx] = map[cx] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bfs(N);

        System.out.println(map[K]);

    }
}
