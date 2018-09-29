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
        int dresult = A[0] * A[1];
        if (dresult > A[indx -1] * A[indx -2]) {
            int result2 = dresult * A[indx];
            if (result2 > result) return  result2;
        }
        return result;
    }
}

