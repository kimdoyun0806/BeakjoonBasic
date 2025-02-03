package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackTracking_num_14889 {
    static int N;
    static int[][] arr = new int[25][25];
    static boolean[] visited = new boolean[25];
    static int res = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            StringTokenizer st =  new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 1);
        System.out.println(res);
    }

    public static void dfs(int cnt, int num) {
        if (cnt == N / 2) {
            int start = 0;
            int link = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (visited[i] && visited[j])
                        start += arr[i][j];
                    if (!visited[i] && !visited[j])
                        link += arr[i][j];
                }
            }
            int temp = Math.abs(start - link);
            if (res > temp) res = temp;
            return;
        }
        for (int i = num; i <= N; i++) {
            visited[i] = true;
            dfs(cnt + 1, i + 1);
            visited[i] = false;
        }
    }
}