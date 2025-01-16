package chapter05;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();

        int[] intArray = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            intArray[i] = sc.nextInt();
        }

        System.out.print("찾는 값:");
        int key = sc.nextInt();

        int idxMin = linearSearch(intArray, key);
        int idxMax = linearSearchR(intArray, key);

        if (idxMin == -1)
            System.out.println("해당 값은 존재하지 않습니다.");
        else if (idxMin == idxMax)
            System.out.println("해당 값은 x[" + idxMin + "]에 있습니다.");
        else {
            System.out.println("해당 값의 요소가 여러 개 존재합니다.");
            System.out.println("가장 앞에 위치한 값은 x[" + idxMin + "]에 있습니다.");
            System.out.println("가장 뒤에 위치한 값은 x[" + idxMax + "]에 있습니다.");
        }
    }

    public static int linearSearch(int[] array, int key) {
        int result = -1;
        // 해당 메소드 실행문 수행
        // linearSearch: 앞에서부터 찾아 찾은 index를 반환
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                result = i;
                return result;
            }
        }
        return result;
    }

    public static int linearSearchR(int[] array, int key) {
        int reuslt = -1;
        // 해당 메소드 실행문 수행
        // linearSearchR: 뒤에서부터 찾아 찾은 index를 반환
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == key) {
                reuslt = i;
                return reuslt;
            }
        }
        return reuslt;
    }
}
