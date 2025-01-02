package chapter02;

// import문 : 다른 클래스 불러오기, package 선언 이후, 클래스 선언 이전에 작성한다.

import java.util.Scanner;

public class ScanInteger {
    public static void main(String[] args) {
        // import문을 작성하면 다른 패키지의 클래스 사용 가능
        Scanner sc = new Scanner(System.in);

        // primitive type (기본, 원시 자료형)
        int value; // 정수 값을 담을 변수
        System.out.print("정수값 : ");

        // 키보드를 통해 입력한 정수를 받는다
        value = sc.nextInt();

        System.out.println(value + "를 입력했습니다.");

        // 키보드로 입력한 정수값에 10을 더하거나 뺀 값을 표시
        System.out.println("10을 더한 값은 " + (value + 10) + "입니다.");
        System.out.println("10을 뺀 값은 " + (value - 10) + "입니다.");

        // 키보드로 입력한 정수값에 10을 곱하거나 나눈 값을 표시
        System.out.printf("10을 곱한 값은 %d입니다.\n", (value * 10));
        System.out.printf("10을 나눈 값은 %d입니다.\n", (value / 10)); // 소숫점 버림


        // 키보드로 입력한 정숫값에 10으로 나눈 나머지 표시
        System.out.println("10으로 나머지 연산한 값은 " + (value % 10) + "입니다.");

        // 키보드로 입력한 정숫값을 음수로 변환
        System.out.println("음수로 변환한 값은 " + (-value) + "입니다.");
    }
}
