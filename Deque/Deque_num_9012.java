package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;


public class Deque_num_9012 {
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

/*public class Deque_num_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                // "(" 이면 카운트 +1
                if(str.charAt(j)=='(')
                    cnt++;
                // ")" 이면 카운트 -1
                else
                    cnt--;
                if(cnt<0)
                    break;
            }
            // 카운트가 0 이면 덱이 빈 것과 똑같다
            if(cnt==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
*/
