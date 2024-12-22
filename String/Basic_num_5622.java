package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Basic_num_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int second = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'B' || ch == 'C')
                second +=3;
            else if(ch == 'D' || ch == 'E' || ch =='F')
                second +=4;
            else if(ch == 'G' || ch == 'H' || ch =='I')
                second +=5;
            else if(ch == 'J' || ch == 'K' || ch =='L')
                second +=6;
            else if(ch == 'M' || ch == 'N' || ch =='O')
                second +=7;
            else if(ch == 'P' || ch == 'Q' || ch =='R' || ch == 'S')
                second +=8;
            else if(ch == 'T' || ch == 'U' || ch =='V')
                second +=9;
            else if(ch == 'W' || ch == 'X' || ch =='Y' || ch == 'Z')
                second +=10;
        }
        System.out.println(second);
    }
}
