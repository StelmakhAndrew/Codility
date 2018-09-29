package Codility;

import java.util.HashSet;

public class Lesson6_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 2, 1, 5, 6, 7, 6, 5, 4, 3, 2}));
    }

    public static int solution(int[] A) {
        HashSet set = new HashSet<Integer>();
        for (int aA : A) {
            set.add(aA);
        }
        return set.size();
    }
}
