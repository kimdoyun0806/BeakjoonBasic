package SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> strmap = new HashMap<>();
        HashMap<Integer, String> intmap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 1;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            strmap.put(input, cnt);
            intmap.put(cnt, input);
            cnt++;
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            // 입력값 숫자이면
            if (Character.isDigit(str.charAt(0))) {
                sb.append(intmap.get(Integer.parseInt(str))).append("\n");
            }
            // 입력값 문자열이면
            else if (!Character.isDigit(str.charAt(0))) {
                sb.append(strmap.get(str)).append("\n");
            }
        }

        System.out.println(sb);

    }
}
