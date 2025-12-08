package DataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class num_7662 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            // Key: 정수, value: 정수의 개수
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if (str.equals("I")) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else if (str.equals("D")) {
                    if (!map.isEmpty()) {
                        int count = 0;
                        if (num == -1)            // 최소값
                            count = map.firstKey();
                        else                      // 최대값
                            count = map.lastKey();
                        map.put(count, map.get(count) - 1);
                        if(map.get(count)==0)
                            map.remove(count);
                    }
                }
            }
            if(map.isEmpty())
                sb.append("EMPTY").append("\n");
            else
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
        }
        System.out.println(sb);
    }
}
