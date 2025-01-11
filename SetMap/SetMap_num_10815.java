package SetMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;


public class SetMap_num_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        HashSet<Integer> set = new HashSet<>();
        // 상근이가 가지고 있는 숫자 카드의 개수
        int N = Integer.parseInt(st.nextToken());
        // 상근이가 가지고 있는 숫자
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            map.put(x, 0);
        }

        // 숫자 카드를 가지고 있으면 1로 변경
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getKey())) {
                entry.setValue(1);
            }
            sb.append(entry.getValue()).append(" ");
        }
        System.out.println(sb);
    }
}
