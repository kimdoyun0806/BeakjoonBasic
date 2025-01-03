package Deque;

import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

public class Deque_num_2164 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 덱에 1~N까지 카드를 넣는다
        for (int i = 1; i <= N; i++) {
            dq.offerLast(i);
        }
        while (dq.size() > 1) {
            dq.pollFirst();
            dq.offerLast(dq.pollFirst());
        }
        System.out.println(dq.peekFirst());
    }
}
