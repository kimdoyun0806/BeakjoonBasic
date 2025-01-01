package Deque;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
import java.util.Iterator;

public class Deque_num_10773 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            // 입력이 0일 경우에는 앞의 정수를 지우기
            if(x==0) {
                dq.poll();
            }
            // 아닐 경우 앞에 입력값 넣기
            else {
                dq.offerFirst(x);
            }
        }

        // deque에 있는 값 순회하며 합 구하기
        while(!dq.isEmpty()) {
            sum += dq.poll();
        }

        /*Iterator<Integer> iterator = dq.iterator();
        while(iterator.hasNext()) {
            sum += iterator.next();
        }

        for(Integer i : dq) {
            sum += i;
        }
         */
        System.out.println(sum);
    }
}
