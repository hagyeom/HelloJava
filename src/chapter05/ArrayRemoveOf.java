package chapter05;

import java.util.Scanner;

public class ArrayRemoveOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("x[" + i + "]:");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삭제할 요소의 인덱스:");
        int idx = sc.nextInt();

        int[] outputArray = arrayRmvOf(inputArray, idx); // 배열에서 해당 인덱스의 값을 제외한 새 배열을 리턴


        PrintArray.printIntArray(outputArray);
    }

   /* public static int[] arrayRmvOf(int[] inputArray, int idx) {
        if (0 <= idx && idx < inputArray.length) {
            for (int i = idx; i < inputArray.length - 1; i++) {
                inputArray[i] = inputArray[i + 1];
            }
        }

        int[] newArray = new int[inputArray.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = inputArray[i];
        }

        return newArray;
    } */

    public static int[] arrayRmvOf(int[] array, int idx) {
        if (idx < 0 || idx >= array.length)
            return array.clone();
        else {
            int[] newArray = new int[array.length - 1];
            int i = 0;

            for (; i < idx; i++)
                newArray[i] = array[i];

            // i = idx; 근데 우리는 i를 새로 만든 배열 기준으로 쓸거야
            for (; i < array.length - 1; i++)
                newArray[i] = array[i + 1];

            return newArray;
        }
    }
}
