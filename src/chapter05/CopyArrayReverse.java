package chapter05;

import java.util.Scanner;

public class CopyArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] oldArray = new int[n];
        int[] newArray = new int[n];

        for (int i = 0; i < oldArray.length; i++) {
            System.out.print("a[" + i + "] = ");
            oldArray[i] = sc.nextInt();
        }

        // 배열 oldArray의 모든 요소를 역순으로 newArray에 복사
        for (int i = 0; i < n; i++) {
            // i=0일 때 newArray[0] = oldArray[3-0-1] = oldArray[2]
            newArray[i] = oldArray[n - i - 1];
        }

        System.out.println("oldArray의 모든 요소를 역순으로 복사했습니다.");
        PrintArray.printIntArray(newArray);
    }
}
