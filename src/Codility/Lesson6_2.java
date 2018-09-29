package Codility;

import java.util.Arrays;

public class Lesson6_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,5}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        for (int i = 0; i < A.length - 2; i++) {
            if ((A[i] + A[i + 1] > A[i + 2]) && (A[i + 2] + A[i + 1] > A[i]) && (A[i] + A[i + 2] > A[i + 1])) {
                return 1;
            }
        }
        return 0;
    }
}
