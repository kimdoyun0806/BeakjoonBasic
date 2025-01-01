package Deque;

import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

public class Deque_num_4949 {

    public static String Yes_or_No(String str) {
        Deque<String> dq = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            // '('일 때 맨 앞에 '(' 넣기
            if (str.charAt(i) == '(')
                dq.offerFirst("(");
                // '['일 때 맨 앞에 '[' 넣기
            else if (str.charAt(i) == '[')
                dq.offerFirst("[");
                // ')'일 때
            else if (str.charAt(i) == ')') {
                // 덱이 비어있거나, 짝이 맞지 않으면
                if (dq.isEmpty() || !dq.peekFirst().equals("("))
                    return "no";
                else
                    dq.pollFirst();
            }
            // ']'일 때
            else if (str.charAt(i) == ']') {
                if (dq.isEmpty() || !dq.peekFirst().equals("["))
                    return "no";
                else
                    dq.pollFirst();
            }
        }
        // 덱이 비어 있으면 yes 아니면 no
        if (dq.isEmpty())
            return "yes";
        else
            return "no";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = br.readLine();
            // 온점이면 종료
            if (str.equals("."))
                break;
            bw.write(Yes_or_No(str) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
