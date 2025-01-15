package Graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Graph_num_24479 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] result;
    static int cnt = 1;

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

        graph = new ArrayList[N+1];
        visited = new boolean[N + 1];
        result = new int[N+1];

        // 그래프 초기화
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        // 그래프 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(R);

        for(int i=1; i<result.length; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

}
