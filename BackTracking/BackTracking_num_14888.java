package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackTracking_num_14888 {
    static int[] operators = new int[4];
    static int N;
    static int[] arr;
    static int res_max = Integer.MIN_VALUE;
    static int res_min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);
        System.out.println(res_max);
        System.out.println(res_min);
    }

    public static void dfs(int res, int cnt) {
        if (cnt == N) {
            res_max = Math.max(res_max,res);
            res_min = Math.min(res_min,res);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                if (i == 0)
                    dfs(res + arr[cnt], cnt + 1);
                else if (i == 1)
                    dfs(res - arr[cnt], cnt + 1);
                else if (i == 2)
                    dfs(res * arr[cnt], cnt + 1);
                else
                    dfs(res / arr[cnt], cnt + 1);
                operators[i]++;
            }
        }
    }
}
