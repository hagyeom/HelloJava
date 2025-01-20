package chapter05;

import java.util.Scanner;

public class ArrayRemoveOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삭제를 시작할 인덱스:");
        int idx = sc.nextInt();

        System.out.print("삭제할 요소의 개수:");
        int n = sc.nextInt();

        int[] outputArray = arrayRmvOfN(inputArray, idx, n);

        PrintArray.printIntArray(outputArray);
    }

    public static int[] arrayRmvOfN(int[] array, int idx, int n) {
        if (idx < 0 || idx >= array.length) {
            return array.clone();
        } else {
            if (idx + n >= array.length) {
                n = array.length - idx;
            }

            int[] newArray = new int[array.length - n];
            int i = 0;

            for (; i < idx; i++) {
                newArray[i] = array[i];
            }

            for (; i < array.length - n; i++)
                newArray[i] = array[i + n];

            return newArray;
        }
    }
}
