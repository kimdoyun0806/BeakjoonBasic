package Array;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Basic_num_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //시험 본 과목의 점수를 넣을 배열
        int[] arr = new int[N];
        int max = 0;
        double sum = 0;
        //배열 점수 넣으면서 최댓값 착기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        for (int i : arr) {
            sum += ((double) i / max) * 100;
        }
        System.out.println(sum / N);
    }
}
