package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Math2_num_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            // -1 입력받으면 종료
            if (n == -1) break;
            // for문을 통해 약수의 합과 n의 약수를 구한다
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    al.add(i);
                    sum += i;
                }
            }
            // n이 완전수라면
            if (sum == n) {
                System.out.print(n + " = ");
                for (int j = 0; j < al.size() - 1; j++)
                    System.out.print(al.get(j) + " + ");
                System.out.println(al.get(al.size() - 1));
            } 
            else {
                System.out.println(n + " is NOT perfect.");
            }
            // 초기화
            al.clear();
            sum = 0;
        }
    }
}

