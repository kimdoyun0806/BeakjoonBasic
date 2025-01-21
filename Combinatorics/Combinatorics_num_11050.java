package Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combinatorics_num_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int res = 1;
        int x = 1;
        for (int i = N; i > N - K; i--)
            res *= i;
        for (int i = K; i > 0; i--)
            x *= i;
        if (K == 0)
            System.out.println(1);
        else
            System.out.println(res/x);
    }
}
