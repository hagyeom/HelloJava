package chapter04;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("양의 정수값:");
            n = sc.nextInt();
        } while (n <= 0);

        int factorial = 1; // 팩토리얼 누적값, 곱셈의 항등원은 1

        for (int i = 1; i <= n; i++) { // Bottom-Up
            factorial *= i;
        }

        System.out.println("1부터 " + n + "까지의 곱은 " + recursiveFactorial(n) + "입니다.");
    }

    public static int recursiveFactorial(int n) { // Top-Down
        if (n == 1)
            return 1;

        return n * recursiveFactorial(n - 1);
    }
}
