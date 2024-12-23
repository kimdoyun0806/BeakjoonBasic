package Deepening;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Basic_num_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //크로아티아 알파벳
        String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;
        String input = br.readLine();
        for(String find : str) {
            input = input.replace(find, "a");
        }
        System.out.println(input.length());

    }
}
