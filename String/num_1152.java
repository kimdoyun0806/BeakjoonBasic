package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split(" ");
        if(str[0].isEmpty())
            System.out.println(0);
        else
            System.out.println(str.length);
    }
}
