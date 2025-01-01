package Deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;


public class Deque_num_28278 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> q = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            // 명령어 1~5
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            // 1이면 정수 x 스택에 넣기
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                q.add(x);
            }
            // 2이면 정수 pop하고 출력, 스택이 비어 있으면 -1 출력
            else if (command == 2) {
                if(q.isEmpty())
                    System.out.println(-1);
                else
                System.out.println(q.pop());
            }
            // 3이면 스택에 들어있는 정수의 개수 출력
            else if(command == 3) {
                System.out.println(q.size());
            }
            // 스택이 비어있으면 1, 아니면 0 출력
            else if(command == 4) {
                if(q.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            // 스택에 정수가 있으면 맨 위의 정수 출력, 없다면 -1 출력
            else if(command == 5) {
                if(q.isEmpty())
                    System.out.println(-1);
                else
                System.out.println(q.peek());

            }
        }
    }
}
