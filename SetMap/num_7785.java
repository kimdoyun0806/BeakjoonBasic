package SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String key = st.nextToken();
            String value = st.nextToken();

            if(value.equals("enter"))
                map.put(key, value);
            else if(value.equals("leave"))
                map.remove(key);
        }


        ArrayList<String> list = new ArrayList<>(map.keySet());

//        Collections.sort(list,Collections.reverseOrder());
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
