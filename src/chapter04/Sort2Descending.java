package chapter04;

import java.util.Scanner;

public class Sort2Descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt();
        System.out.print("정수 b : ");
        int b = sc.nextInt();
        // a가 최대값이 아닌 경우 변수 swap
        if (a < b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("a >= b 가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다."); // 최대값
        System.out.println("변수 b는 " + b + "입니다."); // 최솟값
    }
}
