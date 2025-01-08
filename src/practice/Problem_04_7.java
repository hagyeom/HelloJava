package practice;

import java.util.Scanner;

public class Problem_04_7 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("---------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------------");
            System.out.print("선택> ");

            int n = scanner.nextInt();
            if (n == 1) {
                System.out.print("예금액>");
                int deposits = scanner.nextInt();
                balance += deposits;
                System.out.println();
            } else if (n == 2) {
                System.out.print("출금액>");
                int withdrawal = scanner.nextInt();
                balance -= withdrawal;
                System.out.println();
            } else if (n == 3) {
                System.out.println("잔고>" + balance);
                System.out.println();
            } else if (n == 4) {
                System.out.println();
                break;

            }
        }

        System.out.println("프로그램 종료");
    }
}
