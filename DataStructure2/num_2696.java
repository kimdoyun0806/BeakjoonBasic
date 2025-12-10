package DataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class num_2696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            PriorityQueue<Integer> min = new PriorityQueue<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
            StringTokenizer st = null;
            int M = Integer.parseInt(br.readLine());
            int cnt = 0;

            sb.append(M / 2 + 1 + "\n");

            for (int i = 0; i < M; i++) {
                if (i % 10 == 0)
                    st = new StringTokenizer(br.readLine());

                int num = Integer.parseInt(st.nextToken());

                if (max.size() == min.size())
                    max.offer(num);
                else
                    min.offer(num);
                if (!min.isEmpty()) {
                    if (max.peek() > min.peek()) {
                        int temp1 = max.poll();
                        int temp2 = min.poll();

                        max.offer(temp2);
                        min.offer(temp1);
                    }
                }

                if (i % 2 == 0) {
                    if (cnt == 9 || i == M - 1)
                        sb.append(max.peek() + "\n");
                    else
                        sb.append(max.peek() + " ");
                }
                cnt++;
            }
        }
        System.out.println(sb);
    }
}