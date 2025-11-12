package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int temp = 1;

        while (N > temp) {
            temp += 6 * cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}
