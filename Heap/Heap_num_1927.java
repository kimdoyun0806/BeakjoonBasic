package Heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Heap_num_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            // x = 0 일때
            if (x == 0) {
                // 큐가 비어있다면 0을 출력
                if (pq.isEmpty())
                    sb.append(0).append("\n");
                // 가장 작은 값 출력하고 제거
                else
                    sb.append(pq.poll()).append("\n");
            }
            else
                pq.offer(x);
        }
        System.out.println(sb);
    }
}
