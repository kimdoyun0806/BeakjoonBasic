package Graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Graph_num_24480 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int cnt = 1;
    static int[] result;

    public static void dfs(int x) {
        visited[x] = true;
        result[x] = cnt;
        cnt++;

        for(int nx : graph[x]) {
            if(!visited[nx]) {
                dfs(nx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 0; i < N+1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        // 그래프 역순으로 정렬(내림차순)
        for(int i=0; i<graph.length; i++) {
            Collections.sort(graph[i],Collections.reverseOrder());
        }

        dfs(R);

        for(int i=1; i<result.length; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);

    }
}
