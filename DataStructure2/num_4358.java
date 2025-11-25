package DataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class num_4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();

        int total = 0;
        while(true) {
            String str = br.readLine();
            if(str == null) {
                break;
            }
            total++;
            map.put(str, map.getOrDefault(str,0)+1);
        }

        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }

        Collections.sort(list);

        for(String s : list) {
            int cnt = map.get(s) * 100;
            sb.append(s + " " + String.format("%.4f", (double)cnt / (double) total) + "\n");
        }
        System.out.println(sb);
    }
}
