package DataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class num_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Double> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        Double[] arr = new Double[N];
        String str = br.readLine();
        double result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                dq.addLast(arr[str.charAt(i) - 'A']);
            } else {
                double second = dq.pollLast();
                double first = dq.pollLast();
                switch (str.charAt(i)) {
                    case '+':
                        result= first + second;
                        dq.addLast(result);
                        continue;
                    case '-':
                        result= first - second;
                        dq.addLast(result);
                        continue;
                    case '*':
                        result= first * second;
                        dq.addLast(result);
                        continue;
                    case '/':
                        result= first / second;
                        dq.addLast(result);
                        continue;
                }
            }
        }
        System.out.printf("%.2f",dq.peekLast());
    }
}
