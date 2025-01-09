package chapter04;

import java.util.Scanner;

public class ThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x; // 읽는 값

        do {
            System.out.print("세 자리의 정수값:");
            x = sc.nextInt();
        } while (x < 100 || x > 999); // 세 자리인지 검증하고 세자리가 아니라면 다시 입력 받기

        // 100 ~ 999 : 세 자리 : 100 >= x && x <= 999

        System.out.println("입력한 값은 " + x + "입니다.");
    }
}
