package Math1;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Math2_num_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 거스름돈 액수
        int[] arr = {25, 10, 5, 1};
        int cnt = 0;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int exchange = Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++) {
                if (exchange >= arr[j]) {
                    cnt += exchange / arr[j];
                    exchange = exchange % arr[j];
                }
                System.out.print(cnt + " ");
                cnt = 0;
            }
            System.out.println();
        }
    }
}
