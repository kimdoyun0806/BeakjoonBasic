package Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combinatorics_num_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            long res = 1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N == 0) {
                sb.append(0).append("\n");
                continue;
            }
            else if(M==0) {
                sb.append(1).append("\n");
            }

            for (int i = 0; i < N; i++) {
                res *= (M - i);
                res /= (i + 1);
            }
            sb.append(res).append("\n");
        }

        System.out.print(sb);
    }
}
