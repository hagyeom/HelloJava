package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        // 배열을 섞기 전에 사용자에게 입력을 받아보자
        // 스캐너 객체 선언
        Scanner sc = new Scanner(System.in);

        // 배열 길이 입력 받기
        System.out.print("요소 수:");
        int n = sc.nextInt();

        // 입력 받은 길이만큼 배열 생성하기(int[])
        int[] a = new int[n];

        // 생성한 배열을 순환(Loop)하며 입력을 받기
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        // 배열에 있는 값들을 섞기 (swap)
        Random rand = new Random();

       /* for (int i = 0; i < a.length * 2; i++) {
            // 0 ~ n-1 인덱스를 가진 배열
            int idx1 = rand.nextInt(n); // 0 ~ n-1
            int idx2 = rand.nextInt(n); // 0 ~ n-1

            int temp = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = temp;
        } */

        // Fisher-Yates 알고리즘
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // 0 ~ i

            if (i != j) { // 생성한 난수가 현재 인덱스가 아닐 경우
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        System.out.println("요소를 섞었습니다.");
        PrintArray.printIntArray(a);
    }
}
