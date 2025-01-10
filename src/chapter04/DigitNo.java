package chapter04;

import java.util.Scanner;

public class DigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정수값 자리수를 표시합니다.");
        int x;

        do {
            System.out.print("양의 정수값:");
            x = sc.nextInt();
        } while (x <= 0);

        int digit = 0; // 자리수

        // digit = String.valueOf(x).length();

        // digit에 연산하여 자리 수를 넣어주세요. (10으로 나누고 나서 0보다 큰 경우)

        while (x > 0) {
            x /= 10;
            digit++;
        }

        System.out.println("입력한 숫자는 " + digit + "자리입니다.");
    }
}
