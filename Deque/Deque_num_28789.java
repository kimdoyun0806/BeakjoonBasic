package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Deque_num_28789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                dq.offerFirst(x);
            }
            else if(command == 2) {
                int x = Integer.parseInt(st.nextToken());
                dq.offerLast(x);
            }
            else if(command == 3) {
                if(dq.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(dq.pollFirst()).append("\n");
            }
            else if(command == 4) {
                if(dq.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(dq.pollLast()).append("\n");
            }
            else if(command == 5) {
                sb.append(dq.size()).append("\n");
            }
            else if(command == 6) {
                if(dq.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
            else if(command == 7) {
                if(dq.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(dq.peekFirst()).append("\n");
            }
            else if(command == 8){
                if(dq.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(dq.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
