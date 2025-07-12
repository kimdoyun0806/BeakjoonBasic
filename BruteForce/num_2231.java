package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int sum = 0;
            sum += i;
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                char chr = str.charAt(j);
                sum += Integer.parseInt(String.valueOf(chr));
            }
            if (sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
}
