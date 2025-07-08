package Deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = N;

        for (int i = 0; i < N; i++) {

            boolean[] visited = new boolean[50];
            String str = br.readLine();
            char prev = 0;

            for (int j = 0; j < str.length(); j++) {
                char now = str.charAt(j);

                if (now != prev) {
                    if (visited[now - 'a'] == true) {
                        result--;
                        break;
                    }
                    visited[now -'a'] = true;
                }
                prev = now;
            }
        }
        System.out.println(result);
    }
}
