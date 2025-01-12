package SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SetMap_num_1269 {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            s1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            s2.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> A_difference = new HashSet<>(s1);
        A_difference.removeAll(s2);
        s2.removeAll(s1);
        System.out.println(A_difference.size() + s2.size());
//        //A-B
//        HashSet<Integer> A_difference = new HashSet<>(s1);
//        A_difference.removeAll(s2);
//        cnt += A_difference.size();
//
//        //B-A
//        HashSet<Integer> B_difference = new HashSet<>(s2);
//        B_difference.removeAll(s1);
//        cnt += B_difference.size();

//        System.out.println(cnt);
    }
}
