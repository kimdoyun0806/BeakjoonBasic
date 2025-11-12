package Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        int sum = 0;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        for (int i = N; i <= M; i++) {
            boolean measure = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    measure = true;
                    break;
                }

            }
            if(!measure && i != 1) {
                min = Math.min(min, i);
                sum += i;
            }
        }

        if(sum==0)
            System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
