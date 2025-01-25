package Deepening2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Deepening_num_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            // 글자 수 M 미만인 단어는 패스
            if (str.length() < M)
                continue;
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<String> list = map.keySet()
                .stream()
                .sorted((o1, o2) -> {
                    // 단어 빈도 수
                    if (!map.get(o1).equals(map.get(o2))) {
                        return map.get(o2) - map.get(o1);
                    }
                    // 단어 길이
                    if (o1.length() != o2.length()) {
                        return o2.length() - o1.length();
                    }
                    return o1.compareTo(o2);
                })
                //.toList(); -> Java 16부터 지원
                .collect(Collectors.toList());
//        list.forEach(System.out::println); -> 시간 초과

        for(String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
