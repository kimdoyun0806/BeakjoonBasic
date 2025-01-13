package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Deque_num_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<int[]> dq = new ArrayDeque<>();
        // 풍선의 적힌 숫자를 저장할 배열
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 처음에는 1번 풍선을 터뜨린다
        sb.append("1 ");
        // 1번 풍선의 숫자
        int num = arr[0];

        // 2번 풍선부터 차례대로 풍선에 적힌 숫자를 덱에 넣는다
        for (int i = 1; i < N; i++) {
            dq.addLast(new int[]{ (i + 1), arr[i]});
        }

        while(!dq.isEmpty()) {
            // 양수인 경우
            if(num > 0) {
                for(int i=1; i<num; i++) {
                    dq.addLast(dq.pollFirst());
                }
                // 다음 터질 풍선의 번호와 숫자를 저장
                int[] nextNum = dq.pollFirst();
                num = nextNum[1];
                sb.append(nextNum[0]).append(" ");
            }
            // 음수인 경우 양수인 경우의 반대로
            else {
                for(int i=1; i<-num; i++) {
                    dq.addFirst(dq.pollLast());
                }
                int[] nextNum = dq.pollLast();
                num = nextNum[1];
                sb.append(nextNum[0]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
