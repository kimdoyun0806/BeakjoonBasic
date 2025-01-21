package Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combinatorics_num15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = 1;

        if (N == 1) {
            System.out.println(0);
        } else if (N == 2) {
            System.out.println(2);
        } else {
            for (int i = N; i > N - 2; i--) {
                res *= i;
            }
            System.out.println(res);
        }
    }
}
