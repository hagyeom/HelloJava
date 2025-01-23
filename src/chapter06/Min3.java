package chapter06;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();
        System.out.print("정수 c:");
        int c = sc.nextInt();

        System.out.println("최소값은 " + min(a, b, c));
    }

    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
