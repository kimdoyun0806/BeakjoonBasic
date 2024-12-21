import java.util.Arrays;
import java.util.Collections;

public class ArrayMethod {
    public static void main(String[] args) {
        String[] sarr = {"a", "b", "c", "d", "z", "e", "abc"};
        int[]  iarr = {1, 2, 3, 4, 5, 6, 123, 7};

        //ArrayList로 변환
        System.out.println(Arrays.asList(sarr));

        //String으로 변환
        System.out.println(Arrays.toString(sarr));

        System.out.println(Arrays.toString(iarr));

        //sort, 오름차순 정렬
        Arrays.sort(sarr);
        System.out.println(Arrays.toString(sarr));

        Arrays.sort(iarr);
        System.out.println(Arrays.toString(iarr));

        //sort, 내림차순 정렬(문자열 배열 정렬밖에 되지 않음
        Arrays.sort(sarr, Collections.reverseOrder());
        System.out.println(Arrays.toString(sarr));

        //오류 -> int 배열을 Integer 객체형 배열로 전환해야 한다.
        //Arrays.sort(iarr, Collections.reverseOrder());

    }
}
