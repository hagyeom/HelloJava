package chapter04;

import java.util.Scanner;

public class Measure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값:");

        int n = sc.nextInt();

        int count = 0;

        // for 반복문
        // 1부터 n까지 %(modulo 연산)을 통해 나머지가 0인 경우는 약수

        for (int i = 1; i <= n; i++) {
            // %(modulo 연산)을 통해 나머지가 0인 경우는 약수이므로 count에 누적
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println(n + "의 약수는 " + count + "개입니다.");
    }
}
