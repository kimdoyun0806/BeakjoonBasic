package Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Math2_num_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        // 소인수분해 반복문
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                list.add(i);
                N /= i;
            }
        }
        // 마지막에 남아있는 나머지
        if(N>1)
            list.add(N);

        for (int x : list) {
            System.out.println(x);
        }
    }
}
