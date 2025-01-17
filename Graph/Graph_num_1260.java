package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Graph_num_1260 {
    public static ArrayList<Integer>[] graph;
    public static boolean[] dfsVisited;
    public static boolean[] bfsVisited;

    public static StringBuilder sb1 = new StringBuilder();
    public static StringBuilder sb2 = new StringBuilder();


    public static void dfs(int x) {
        dfsVisited[x] = true;
        sb1.append(x).append(" ");

        for (int i : graph[x]) {
            if (!dfsVisited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int x) {
        Queue<Integer> q = new ArrayDeque<>();
        bfsVisited[x] = true;
        q.offer(x);
        sb2.append(x).append(" ");

        while(!q.isEmpty()) {
            int nx = q.poll();
            for(int i : graph[nx]) {
                if(!bfsVisited[i]) {
                    bfsVisited[i] = true;
                    q.offer(i);
                    sb2.append(i).append(" ");
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        dfsVisited = new boolean[N + 1];
        bfsVisited = new boolean[N + 1];

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

        for(int i=0; i<graph.length; i++) {
            Collections.sort(graph[i]);
        }

        dfs(V);
        bfs(V);
        System.out.println(sb1);
        System.out.println(sb2);


    }
}
