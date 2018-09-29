package Codility;

import java.util.Arrays;

public class Lesson6_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-3, 1, 2,-2,5,6}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int indx = A.length - 1;
        int result = A[indx] * A[indx - 1] * A[indx - 2];
        if (result < 0 && indx - 3 >= 0) {
            if (result < A[indx - 3] * A[indx - 1] * A[indx - 2]) return A[indx - 3] * A[indx - 1] * A[indx - 2];
        }
        return result;
    }
}

