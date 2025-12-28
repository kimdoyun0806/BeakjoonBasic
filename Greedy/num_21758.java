package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class num_21758 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] honey = new long[N];
        long[] left = new long[N];
        long[] right = new long[N];

        long total = 0; // 총 꿀의양
        long res = 0; // 결과

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            honey[i] = Integer.parseInt(st.nextToken());
            total += honey[i];
        }

        long tmp = 0;
        for (int i = 0; i < N; i++) {
            tmp += honey[i];
            left[i] = tmp;
        }

        tmp = 0;
        for (int i = N - 1; i >= 0; i--) {
            tmp += honey[i];
            right[i] = tmp;
        }

        // 벌 벌 꿀통
        for (int i = 1; i <= N - 2; i++) {
            long bee1 = total - honey[0] - honey[i];
            long bee2 = total - left[i];
            res = Math.max(res, bee1 + bee2);
        }
        // 꿀통 벌 벌
        for (int i = N - 2; i >= 1; i--) {
            long bee1 = total - honey[N - 1] - honey[i];
            long bee2 = total - right[i];
            res = Math.max(res, bee1 + bee2);
        }

        // 벌 꿀통 벌
        for (int i = 1; i <= N - 2; i++) {
            long bee1 = left[i] - honey[0];
            long bee2 = right[i] - honey[N - 1];
            res = Math.max(res, bee1 + bee2);
        }

        System.out.println(res);
    }
}
