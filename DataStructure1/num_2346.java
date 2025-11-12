package DataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Principal;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class num_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<int[]> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            dq.addLast(new int[]{i + 1, arr[i]});
        }

        // 첫 번째 풍선의 숫자
        int idx = arr[0];
        // 첫 번째 풍선 출력
        sb.append(1).append(" ");

        while (!dq.isEmpty()) {
            if (idx > 0) {
                for (int i = 1; i < idx; i++) {
                    dq.addLast(dq.pollFirst());
                }
                int[] nxt = dq.pollFirst();
                idx = nxt[1];
                sb.append(nxt[0]+" ");
            }
            else{
                for (int i=1; i<-idx; i++) {
                    dq.addFirst(dq.pollLast());
                }
                int[] nxt = dq.pollLast();
                idx = nxt[1];
                sb.append(nxt[0] + " ");
            }
        }
        System.out.println(sb);
    }
}