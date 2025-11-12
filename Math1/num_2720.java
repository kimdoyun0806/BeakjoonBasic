package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = {25, 10, 5, 1};

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cent = Integer.parseInt(st.nextToken());

            for (int j = 0; j < arr.length; j++) {
                if (cent >= arr[j]) {
                    cnt += cent / arr[j];
                    cent = cent % arr[j];
                }
                System.out.print(cnt + " ");
                cnt = 0;
            }
            System.out.println();


        }
    }
}
