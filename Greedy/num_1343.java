package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        while(true) {
            if(str.contains("XXXX"))
                str = str.replace("XXXX","AAAA");
            else if(str.contains("XX"))
                str = str.replace("XX","BB");
            else
                break;
        }
        if(str.contains("X"))
            System.out.println(-1);
        else
            System.out.println(str);
    }
}
