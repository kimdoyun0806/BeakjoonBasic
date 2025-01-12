package SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map;

public class SetMap_num_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // Collection은 사용이 불가능(List에서 사용 가능)
        // 자료구조에서 사용 가능한 Comparator을 사용하자
        TreeMap<String, String> tree = new TreeMap<>(Comparator.reverseOrder());
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            tree.put(st.nextToken(),st.nextToken());
        }

        for(Map.Entry<String,String> entry : tree.entrySet()) {
            if(entry.getValue().contains("enter"))
                System.out.println(entry.getKey());
        }

    }
}
