package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Basic_num_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        StringBuffer sb1 = new StringBuffer(str[0]);
        StringBuffer sb2 = new StringBuffer(str[1]);
        int A = Integer.parseInt(sb1.reverse().toString());
        int B = Integer.parseInt(sb2.reverse().toString());
        if(A>B)
            System.out.println(A);
        else
            System.out.println(B);
    }
}

/* 다른 사람의 풀이 코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

		System.out.print(A > B ? A:B);

	}
}
 */