package Deque;

import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Deque_num_18258 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            // push 명령
            if (command.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                dq.offerLast(x);
            }
            // pop 명령
            else if (command.equals("pop")) {
                if (dq.isEmpty())
                    bw.write(-1 + "\n");
                else
                    bw.write(dq.pollFirst() + "\n");
            }
            // empty 명령
            else if(command.equals("empty")) {
                if(dq.isEmpty())
                    bw.write(1 + "\n");
                else
                    bw.write(0 + "\n");
            }
            // size 명령
            else if(command.equals("size")) {
                bw.write(dq.size() + "\n");
            }
            // front 명령
            else if(command.equals("front")) {
                if(dq.isEmpty())
                    bw.write(-1 + "\n");
                else
                    bw.write(dq.peekFirst() + "\n");
            }
            // back 명령
            else if(command.equals("back")) {
                if(dq.isEmpty())
                    bw.write(-1 + "\n");
                else
                    bw.write(dq.peekLast() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}





