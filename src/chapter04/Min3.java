package chapter04;

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

        // 세 정수 중에 최소값을 min에 저장하여 출력해주세요.

        int min = a;

        if (min > b) {
            min = b;
        }
        
        if (min > c) {
            min = c;
        }

        System.out.println("최소값은 " + min + "입니다.");
    }
}
