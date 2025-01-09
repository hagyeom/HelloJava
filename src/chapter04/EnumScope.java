package chapter04;

import java.util.Scanner;

public class EnumScope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();

        System.out.print("정수 b:");
        int b = sc.nextInt();

        // 오름차순
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        do {
            System.out.print(a + " "); // a++로 변경 가능
            a = a + 1;
        } while (a <= b);
        System.out.println();
    }
}
