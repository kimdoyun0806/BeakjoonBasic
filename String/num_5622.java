package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'B' || ch == 'C')
                result +=3;
            else if(ch == 'D' || ch == 'E' || ch =='F')
                result +=4;
            else if(ch == 'G' || ch == 'H' || ch =='I')
                result +=5;
            else if(ch == 'J' || ch == 'K' || ch =='L')
                result +=6;
            else if(ch == 'M' || ch == 'N' || ch =='O')
                result +=7;
            else if(ch == 'P' || ch == 'Q' || ch =='R' || ch == 'S')
                result +=8;
            else if(ch == 'T' || ch == 'U' || ch =='V')
                result +=9;
            else if(ch == 'W' || ch == 'X' || ch =='Y' || ch == 'Z')
                result +=10;
        }
        System.out.println(result);
    }
}
