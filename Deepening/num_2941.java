package Deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();
        for(int i=0; i<croatia.length; i++) {
            if(str.contains(croatia[i])) {
                str.replace(croatia[i],"a");
            }
        }
        System.out.println(str.length());
    }
}
