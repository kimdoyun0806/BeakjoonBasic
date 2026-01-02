package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class num_2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> sensor = new ArrayList<>();
        ArrayList<Integer> distance = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            sensor.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(sensor);

        for (int i = 1; i <= N - 1; i++) {
            int tmp = sensor.get(i) - sensor.get(i - 1);
            distance.add(tmp);
        }
        Collections.sort(distance);

        for (int i = 0; i < distance.size() - (K - 1); i++) {
            res += distance.get(i);
        }

        System.out.println(res);
    }
}
