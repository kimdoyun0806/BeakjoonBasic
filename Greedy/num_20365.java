package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_20365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int red_cnt = 0;
        int blue_cnt = 0;

        if(arr[0] =='R')
            red_cnt++;
        else
            blue_cnt++;

        for (int i = 1; i < N; i++) {
            if (arr[i] != arr[i - 1]) {
                if(arr[i] =='R')
                    red_cnt++;
                else
                    blue_cnt++;
            }
        }
        System.out.println(Math.min(red_cnt,blue_cnt)+1);
    }
}
