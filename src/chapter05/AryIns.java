package chapter05;

import java.util.Scanner;

public class AryIns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("a[" + i + "] = ");
            // i 인덱스를 이용해서 inputArray[i]의 입력값(sc.nextInt()) 할당하기
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삽입할 요소의 인덱스:");
        int idx = sc.nextInt();

        System.out.print("삽입할 값:");
        int value = sc.nextInt();

        aryIns(inputArray, idx, value); // inputArray[idx]에 value를 삽입

        PrintArray.printIntArray(inputArray);
    }

    public static void aryIns(int[] arr, int idx, int value) {
        if (idx >= 0 && idx < arr.length) {
            for (int i = arr.length - 1; i > idx; i--) {
                arr[i] = arr[i - 1];
            }
            arr[idx] = value;
        }
    }
}
