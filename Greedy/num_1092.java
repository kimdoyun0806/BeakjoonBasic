package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class num_1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> crain = new ArrayList<>();
        ArrayList<Integer> box = new ArrayList<>();
        int res = 0;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            crain.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            box.add(Integer.parseInt(st.nextToken()));
        }

        crain.sort(Comparator.reverseOrder());
        box.sort(Comparator.reverseOrder());

        if (crain.get(0) < box.get(0)) {
            System.out.println(-1);
            return;
        }

        while (!box.isEmpty()) {
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                while(cnt < box.size()) {
                    if(crain.get(i) >= box.get(cnt)) {
                        box.remove(cnt);
                        break;
                    }
                    else
                        cnt++;
                }
            }
            res++;
        }
        System.out.println(res);
    }
}
