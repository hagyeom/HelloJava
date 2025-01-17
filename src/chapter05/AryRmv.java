package chapter05;

import java.util.Scanner;

public class AryRmv {
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

        System.out.print("삭제할 요소의 인덱스:");
        int idx = sc.nextInt();

        arrRmv(inputArray, idx);
        // 출력
        PrintArray.printIntArray(inputArray);
    }

    public static void arrRmv(int[] inputArray, int idx) {
        // idx 값의 유효한 범위는? 0 ~ inputArray.length - 1
        if (0 <= idx && idx < inputArray.length) { // idx의 값이 유효할 때만(예외 발생 방지용 코드)
            for (int i = idx; i < inputArray.length - 1; i++) {
                inputArray[i] = inputArray[i + 1];
            }
        }
    }
}
