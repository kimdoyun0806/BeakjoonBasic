package DataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class num_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            Deque<int[]> dq = new ArrayDeque<>();
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 문서의 개수 N
            int N = Integer.parseInt(st.nextToken());
            // 궁금한 문서의 위치
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            // 각 문서의 중요도를 넣는 과정
            for (int i = 0; i < N; i++) {
                dq.addLast(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            while (!dq.isEmpty()) {
                int[] idx = dq.pollFirst();
                // 현재 문서보다 높은 우선순위 존제 여부
                boolean isMax = false;

                // 맨 왼쪽의 문서와 나머지 문서들의 중요도 비교
                for (int[] nxt : dq) {
                    if (nxt[1] > idx[1]) {
                        isMax = true;
                        break;
                    }
                }
                // 뒤에 더 큰 우선순위가 있으니 뒤로 배치
                if (isMax) {
                    dq.addLast(idx);
                }
                else {
                    count++;
                    if (idx[0] == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
