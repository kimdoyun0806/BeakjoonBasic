package Deepening2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Deepening_num_26069 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("ChongChong", true);

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A =st.nextToken();
            String B =st.nextToken();

            if (map.getOrDefault(A, false) || map.getOrDefault(B, false)) {
                map.put(A,true);
                map.put(B,true);
            }
        }
        System.out.println(map.size());
    }
}
