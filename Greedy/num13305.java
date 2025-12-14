package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] oil = new long[N];
        long[] road = new long[N - 1];
        long res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            oil[i] = Integer.parseInt(st.nextToken());
        }

        long min = oil[0];
        res = road[0] * min;

        for (int i = 1; i < N - 1; i++) {
            if (min > oil[i])
                min = oil[i];
            res += road[i] * min;
        }

        System.out.println(res);
    }
}
