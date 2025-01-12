package SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SetMap_num_11478 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length()+1; j++) {
                set.add(str.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}
