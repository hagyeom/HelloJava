package chapter04;

import java.util.Scanner;

public class IsoscelesTriangleLB { // 왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? :");
        int n = sc.nextInt();

        // 왼쪽 아래가 직각인 이등변 삼각형을 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



