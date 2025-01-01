package Deque;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// 덱1, 덱2 두개 생성 후 cnt=1부터 시작해서
// 덱1을 덱2로 넣을 때 cnt와 정수가 일치하면 넣지말고 없앤 후 cnt++
// 만약 덱2에 정수를 넣을 때 넣을 정수 값이 앞에 있던 정수보다 높으면 false
// 모두 넣어지면 true

public class Deque_num_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //현재 줄 서 있는 곳
        Deque<Integer> dq_first = new ArrayDeque<>();
        //빈 대기열에 넣을 곳
        Deque<Integer> dq_second = new ArrayDeque<>();
        //학생 번호표 카운트
        int cnt = 1;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        //덱 1에 학생들의 번호표 넣기
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            dq_first.offerLast(x);
        }
        //덱 2에 덱 1의 학생들의 번호표를 순서대로 넣기
        while (!dq_first.isEmpty() || !dq_second.isEmpty()) {
            // 만약 번호표가 간식 받는 곳으로 갈 수 있다면 없앤다
            if (!dq_first.isEmpty() && cnt == dq_first.peekFirst()) {
                dq_first.pollFirst();
                cnt++;
            }
            // 대기열에서 간식 받는 곳으로 갈 수 있다면 없앤다
            else if (!dq_second.isEmpty() && cnt == dq_second.peekFirst()) {
                dq_second.pollFirst();
                cnt++;
            }
            // 아니면 덱 2에 스택 쌓기
            else if (!dq_first.isEmpty()) {
                dq_second.offerFirst(dq_first.pollFirst());
            }
            else{
                bw.write("Sad");
                bw.flush();
                bw.close();
                return;
            }
        }
        bw.write("Nice");
        bw.flush();
        bw.close();
    }
}
