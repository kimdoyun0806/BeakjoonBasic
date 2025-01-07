package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Deque_num_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        // A가 0일 때만 덱에 B의 원소를 집어넣는다
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st1.nextToken());
            int B = Integer.parseInt(st2.nextToken());
            if (A == 0) {
                dq.offerLast(B);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int C = Integer.parseInt(st3.nextToken());
            dq.offerFirst(C);
            sb.append(dq.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}
