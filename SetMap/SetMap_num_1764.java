package SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SetMap_num_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        TreeSet<String> treeSet = new TreeSet<>();
        TreeSet<String> result = new TreeSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            treeSet.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (treeSet.contains(name)) {
                result.add(name);
            }
        }

        System.out.println(result.size());

        for (String name : result) {
            System.out.println(name);
        }
    }
}
