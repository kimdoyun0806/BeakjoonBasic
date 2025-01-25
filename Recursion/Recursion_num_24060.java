package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Recursion_num_24060 {

    public static int cnt = 0;
    public static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
        }
        mergeSort(arr, 0, N - 1);

        if (cnt < K)
            System.out.println(-1);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        // 분할할 부분이 남아 있는 경우
        if (left < right) {
            // 배열을 분할할 인덱스 계산
            int mid = (left + right) / 2;

            // 왼쪽 부분 배열 정렬
            mergeSort(arr, left, mid);

            // 오른쪽 부분 배열 정렬
            mergeSort(arr, mid + 1, right);

            // 정렬된 두 부분의 배열을 정렬하여 합치는 메소드
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // 임시 배열 생성
        int[] temp = new int[right - left + 1];
        // 왼쪽 부분 배열의 시작 인덱스
        int i = left;
        // 오른쪽 부분 배열의 시작 인덱스
        int j = mid + 1;
        // 임시 배열의 인덱스
        int tempIndex = 0;

        // 두 부분 배열의 인덱스를 비교하여 임시 배열에 정렬하여 저장
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[tempIndex++] = arr[i++];
            } else {
                temp[tempIndex++] = arr[j++];
            }
        }

        // 왼쪽 부분 배열에 남아 있는 요소가 있으면 임시 배열에 저장
        while (i <= mid) {
            temp[tempIndex++] = arr[i++];
        }
        // 오른쪽 부분 배열에 남아 있는 요소가 있으면 임시 배열에 저장
        while (j <= right) {
            temp[tempIndex++] = arr[j++];
        }

        //임시 배열의 요소들을 원래 배열에 저장
        for (tempIndex = 0; tempIndex < temp.length; tempIndex++) {
            arr[left + tempIndex] = temp[tempIndex];
            cnt++;
            if (cnt == K) {
                System.out.println(arr[left+tempIndex]);
                break;
            }
        }
    }
}
