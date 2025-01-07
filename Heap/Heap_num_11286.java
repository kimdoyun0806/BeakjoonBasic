package Heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Comparator;

public class Heap_num_11286 {
    public static void main(String[] args) throws IOException {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2))
                    return o1 - o2;
                return Math.abs(o1) - Math.abs(o2);
            }
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if(x==0) {
                if(pq.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(pq.poll()).append("\n");
            }
            else {
                pq.offer(x);
            }
        }
        System.out.println(sb);
    }
}
