package Deepening2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Deepening_num_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 배열 오름차순 정렬(중강값과, 범위를 구하기 위함)
        Arrays.sort(arr);

        sb.append(Mean(arr)).append("\n");
        sb.append(Median(arr)).append("\n");
        sb.append(Mode(arr)).append("\n");
        sb.append(Range(arr)).append("\n");

        System.out.println(sb);
    }

    // 산술 평균 메소드
    public static int Mean(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (int) Math.round((double) sum / arr.length);
    }

    // 중앙값 메소드
    public static int Median(int[] arr) {
        return arr[arr.length / 2];
    }

    // 최빈값 메소드
    public static int Mode(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int maxCount = 0;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            maxCount = Math.max(maxCount,map.get(i));
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(maxCount == entry.getValue())
                list.add(entry.getKey());
        }
        Collections.sort(list);

        // 최빈값이 여러개일 경우 두 번째 인덱스를 출력하면
        // 두 번째로 작은 값을 출력할 수 있다.
        if(list.size() > 1)
            return list.get(1);
        else
            return list.get(0);
    }

    // 범위 메소드
    public static int Range(int[] arr) {
        return arr[arr.length-1] - arr[0];
    }
}
