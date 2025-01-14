package chapter05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class ArrayRandY {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[7];

        // 1 ~ 45까지의 난수를 발생시키기
        // 중복된 수가 발생하지 않게끔 난수 저장
        // 1. 여태 뽑은 수와 지금 뽑은 수를 비교
        // 2. 지금 뽑은 수가 중복이면 다시 뽑음
        // 3. 해당 로직을 index 0부터 n-1까지 수행하여 배열에 저장

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + rand.nextInt(45);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    // 다시 뽑기 위해서 i값의 조정이 필요
                    i--;
                    break;
                }

            }
        }

        Arrays.sort(array); // 오름차순 정렬
        PrintArray.printIntArray(array);

        HashSet<Integer> set = new HashSet<Integer>();

        /* while (set.size() != 7) {
            set.add(1 + rand.nextInt(45));
        }

        System.out.println(set); */


    }
}
