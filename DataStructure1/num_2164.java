package DataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public interface num_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }

        while (dq.size() > 1) {
            dq.pollFirst();
            int temp = dq.pollFirst();
            dq.addLast(temp);
        }

        System.out.println(dq.peekLast());
    }
}
