package chapter04;

import java.util.Scanner;

public class Sqaure {
    public static void main(String[] args) {
        // 정수 n을 입력 받아서 1부터 n까지의 제곱을 출력하시오
        // 1. 변수 또는 객체 선언
        // 2. 해당 로직 수행
        // 3. 출력
        // 예시
        // 예시) n = 2
        // "1의 제곱은 1입니다."
        // "2의 제곱은 4입니다."
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "의 제곱은 " + i * i + "입니다.");
        }
    }
}
