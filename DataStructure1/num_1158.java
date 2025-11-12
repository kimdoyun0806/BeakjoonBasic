package DataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class num_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }

        sb.append("<");

        while (dq.size()>1) {
            for (int i = 1; i < K; i++) {
                int temp = dq.pollFirst();
                dq.addLast(temp);
            }
            sb.append(dq.pollFirst()).append(",").append(" ");
        }

        sb.append(dq.pollFirst()).append(">");

        System.out.println(sb);
    }
}
