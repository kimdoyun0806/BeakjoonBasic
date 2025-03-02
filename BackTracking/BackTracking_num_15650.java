package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackTracking_num_15650 {
    public static int[] arr;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();
    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N+1];

        backtrack(0, 1);

        System.out.println(sb);

    }

    public static void backtrack(int depth, int idx) {
        if (depth == M) {
            for (int i : arr)
                sb.append(i).append(" ");
            sb.append("\n");
            return;
        }

        for (int i = idx; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                backtrack(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}
