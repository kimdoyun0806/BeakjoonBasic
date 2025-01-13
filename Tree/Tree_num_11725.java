package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Tree_num_11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List<List<Integer>> list = new ArrayList<>();
        // 빈 리스트 생성
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }
        int[] parent = new int[N + 1];

        Queue<Integer> q = new ArrayDeque<>();
        // 루트 노드(1)
        q.add(1);

        while (!q.isEmpty()) {
            int parentNode = q.poll();

            for (int childNode : list.get(parentNode)) {
                // 방문된 노드는 continue
                if (parent[childNode] != 0)
                    continue;
                //
                parent[childNode] = parentNode;
                q.add(childNode);
            }
        }
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }
}
