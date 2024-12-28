package Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math2_num_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 약수의 개수
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (x == 1) {
                cnt++;
                continue;
            }
            // 약수인 수 구하기
            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    cnt++;
                    break;
                }
            }
        }
        // 전체 개수 N에서 약수인 개수 빼기
        System.out.println(N-cnt);
    }
}