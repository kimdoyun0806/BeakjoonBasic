package DataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class num_2493 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<int[]> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int top = Integer.parseInt(st.nextToken());
            while (!dq.isEmpty()) {
                if (dq.peekLast()[1] > top) {
                    sb.append(dq.peekLast()[0]).append(" ");
                    break;
                }
                dq.pollLast();
            }
            if (dq.isEmpty())
                sb.append(0).append(" ");
            dq.addLast(new int[]{i, top});
        }
        System.out.println(sb);
    }
}
