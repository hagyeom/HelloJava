package chapter04;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("카운트다운 합니다.");

        int x;
        do {
            System.out.print("양의 정수값:");
            x = sc.nextInt();
        } while (x <= 0);

        // while문
        while (x >= 0) {
            // --x로 변경해보자
            System.out.println(x--); // x 값을 표시한 후 감소시킴
            // System.out.println("x의 값이 " + x + "이 됐습니다."); // x 값 표시
            Thread.sleep(1000);
        }
    }
}
