package DataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class num_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int start = 0;

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if (n > start) {
                for (int i = start + 1; i <= n; i++) {
                    dq.addLast(i);
                    sb.append('+').append("\n");
                }
                start = n;
            } else if (dq.peekLast() != n) {
                System.out.println("NO");
                return;
            }
            dq.pollLast();
            sb.append('-').append("\n");
        }
        System.out.println(sb);
    }
}
