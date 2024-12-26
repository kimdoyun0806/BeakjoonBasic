package Math1;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Math1_num_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = 2;
        for (int i = 0; i < N; i++) {
            res = res + (res - 1);
        }
        System.out.println((int)Math.pow(res,2));
    }
}
