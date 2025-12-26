package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class num_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1[1] == o2[1])
                return o1[0] - o2[0];
            else
                return o1[1] - o2[1];

        });
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            pq.offer(new int[]{a, b});
        }
        int end = 0;
        int cnt = 0;
        while (!pq.isEmpty()) {
            int[] arr = pq.poll();
            if(arr[0] >= end) {
                cnt++;
                end = arr[1];
            }
        }
        System.out.println(cnt);

    }
}
