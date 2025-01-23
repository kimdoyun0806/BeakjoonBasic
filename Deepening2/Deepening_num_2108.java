package Deepening2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Deepening_num_2108 {
    public static void main(String[] args) throws IOException {

        final int size = 8000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());


        int[] arr = new int[N];
        //최빈값 배열
        int[] mode = new int[size];
        int maxCount = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            max = Math.max(max,x);
            min = Math.min(min,x);
            sum += x;
            arr[i] = x;
            mode[x]++;

        }
        Arrays.sort(arr);

        sb.append((int) Math.round(((double) sum / N))).append("\n");
        sb.append(arr[arr.length / 2]).append("\n");
        sb.append((max - min)).append("\n");

        System.out.println(sb);

    }
}
