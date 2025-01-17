package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph_num_2606 {

    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;
    public static int cnt = 0;

    public static void bfs(int x) {
        visited[x] = true;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(x);
        cnt++;
        while(!q.isEmpty()) {
            int nx = q.poll();
            for(int i : graph[nx]) {
                if(!visited[i]) {
                    visited[i] = true;
                    cnt++;
                    q.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        graph = new ArrayList[computer + 1];
        visited = new boolean[computer + 1];

        for (int i = 0; i < computer + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=1; i<=num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        bfs(1);

        System.out.println(cnt-1);
    }
}
