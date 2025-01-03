package Deque;

import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.StringTokenizer;


public class Deque_num_11866 {
    public static void main(String[] args) throws IOException {
        //1~N번 까지의 사람이 있는 덱
        Deque<Integer> before = new ArrayDeque<>();
        //제거된 사람들이 있는 덱
        Deque<Integer> after = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1~N번까지의 사람 덱에 넣기
        for (int i = 1; i <= N; i++) {
            before.offerLast(i);
        }
        while (!before.isEmpty()) {
            // K-1번 만큼 맨 앞의 번호를 뒤로 넘기고 K 번째에 제거
            for (int i = 0; i < K - 1; i++) {
                before.offerLast(before.pollFirst());
            }
            after.offerLast(before.pollFirst());
        }
        bw.write("<");
        // 덱에있는 숫자 -1 까지 출력
        for (int i = 0; i < N-1; i++) {
            bw.write(after.pollFirst() + ", ");
        }
        //마지막 숫자 출력
        bw.write(after.peekLast() + ">");
        bw.flush();
        bw.close();
    }
}
