package Codility;

public class Lesson6_4 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 2, 1, 4, 0}));
    }

    public static int solution(int[] A) {
        int count = 0;
        int elem = 1;
        int len1 = 0;
        int len2 = 0;
        int[] len1Arr = new int [A.length];
        int[] len2Arr = new int [A.length];
        len1Arr[0] = 0 - A[0];
        len2Arr[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            len1 = i - A[i];
            len2 = i + A[i];
            for (int j = 0; j < elem ; j++) {
                if (
//                        (len2 >= len1Arr[j] && len1 >= len2Arr[j])||
                        (len1 <= len1Arr[j] && len1 <= len2Arr[j])||
                        (len1 >= len1Arr[j] && len1 <= len2Arr[j])||
                        (len2 <= len2Arr[j] && len2 >= len1Arr[j])){
                    count++;
                }

            }
        len1Arr[i] = len1;
        len2Arr[i] = len2;
        elem++;
        }
        return count;
    }
}
