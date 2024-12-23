package Array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array2_num_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = arr[0][0];
        // 행렬의 위치를 찾기위한 변수
        int A=0;
        int B=0;
        // 행렬에 값 입력 후 최댓값까지 저장
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max,arr[i][j]);
            }
        }
        // 행렬에 있는 최댓값의 인덱스 찾기
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] == max) {
                    A = i+1;
                    B = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(A + " " + B);
    }
}
