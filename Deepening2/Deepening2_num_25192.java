package Deepening2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Deepening2_num_25192 {
    public static void main(String[] args) throws IOException {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(str.equals("ENTER")) {
                cnt += set.size();
                set.clear();
            }
            else{
                set.add(str);
            }
        }
        cnt += set.size();
        System.out.println(cnt);
    }
}
