package chapter05;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] array = new int[n];

        // 배열 요소 입력 받기
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        System.out.println("--------------- 메서드 사용 -----------------");
        printIntArray(array);
    }

    public static void printIntArray(int[] array) {
        System.out.print("{");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        // 빈 배열의 경우 길이가 0이므로 array[-1]에 접근하므로 조건 설정 필요
        if (array.length >= 1) {
            System.out.print(array[array.length - 1]);
        }

        System.out.print("}");
    }

    public static void printDoubleArray(double[] array) {
        System.out.print("{");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        // 빈 배열의 경우 길이가 0이므로 array[-1]에 접근하므로 조건 설정 필요
        if (array.length >= 1) {
            System.out.print(array[array.length - 1]);
        }

        System.out.print("}");
    }
}
