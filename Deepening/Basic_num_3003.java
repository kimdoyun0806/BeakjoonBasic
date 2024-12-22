package Deepening;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Basic_num_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //킹, 퀸, 룩, 비숏, 나이트, 폰
        int[] arr1 = {1, 1, 2, 2, 2, 8};
        int[] arr2 = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 6; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            System.out.print( (arr1[i] - arr2[i]) + " ");
        }
    }
}
