package DataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class num_9012 {
    public static String Yes_or_NO (String str) {
        Deque<String> dq = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            // '(' 문자면 앞에서부터 값 넣기
            if (str.charAt(i) == '(') {
                dq.offerFirst("(");
            }
            // ')' 문자면 앞에서부터 값 지우기
            else if (str.charAt(i) == ')') {
                //만약 ')'이 맨 앞이라면 무조건 NO
                if(dq.isEmpty())
                    return "NO";
                dq.pollFirst();
            }
        }
        // 덱에 값이 남아있으면 NO, 없으면 YES 출력
        if (dq.isEmpty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            System.out.println(Yes_or_NO(str));
        }
    }
}
