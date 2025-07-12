package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] sort = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] =sort[i] =  Integer.parseInt(st.nextToken());

        }
        Arrays.sort(sort);

        for (int i : sort) {
            if (!map.containsKey(i)) {
                map.put(i, cnt);
                cnt++;
            }
        }

        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
