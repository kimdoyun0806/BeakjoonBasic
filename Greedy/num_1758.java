package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class num_1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long res = 0;
        int cnt = 1;
        ArrayList<Integer> arr = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        arr.sort(Collections.reverseOrder());

        for (Integer o : arr) {
            int change = o - (cnt - 1);
            if (change < 0)
                continue;
            res += change;
            cnt++;
        }

        System.out.println(res);
    }
}
