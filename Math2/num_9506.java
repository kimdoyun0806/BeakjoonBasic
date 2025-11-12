package Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringBuilder sb = new StringBuilder();
            int sum = 1;
            int n = Integer.parseInt(br.readLine());
            sb.append(n + " = 1");

            if (n == -1) {
                break;
            }

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }

            if(sum == n) {
                System.out.println(sb);
            }
            else
                System.out.println(n + " is NOT perfect.");

        }
    }
}
