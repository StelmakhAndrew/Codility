package Codility;

import java.util.ArrayList;
    import java.util.Arrays;

public class Lesson4_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));

    }

    public static int[] solution(int N, int[] A) {
        int[] counter = new int [N];
        int max=0;
        for (int elem:A) {
            if (elem  <= N ){
                counter[elem-1]++;
                if(max < counter[elem -1 ]) max = counter[elem - 1];
            }
            else {
                for (int i = 0; i <counter.length ; i++) {
                    counter[i] = max;
                }
            }
        }
        return counter;
    }
}
