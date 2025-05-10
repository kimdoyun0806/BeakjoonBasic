package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic_num_2748 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long sum = 1;
        long A = 0;
        long B = 1;

        for(int i=1; i<N; i++) {
            if(N==1) {
                System.out.println(1);;
                return;
            }
            sum = B + A;
            A = B;
            B = sum;
        }

        System.out.println(sum);
    }
}
