package practice;

import java.util.Scanner;

class CommandRangeException extends RuntimeException { // 커맨드 범위 예외
    public CommandRangeException() {

    }

    public CommandRangeException(String message) {
        super(message);
    }
}

class InsufficientBalance extends RuntimeException { // 잔고 부족 예외
    public InsufficientBalance() {

    }

    public InsufficientBalance(String message) {
        super(message);
    }
}

public class Problem_04_7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean needRun = true;
        int balance = 0;


        while (needRun) {
            try {
                needRun = commandProcess(balance);
            } catch (InsufficientBalance e) {
                System.out.println(e.getMessage() + "다시 커맨드창으로 이동합니다.");
                needRun = true;
            } catch (CommandRangeException e) {
                System.out.println(e.getMessage() + "커맨드가 보이지 않으시면 옆 창구의 시각 장애인용 ATM기를 이용해주세요.");
                needRun = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    public static boolean commandProcess(int balance) throws InsufficientBalance, CommandRangeException {

        System.out.println("---------------------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("---------------------------------------");
        System.out.print("선택> ");

        int cmd = sc.nextInt();

        switch (cmd) {
            case 1: // 예금
                System.out.print("예금액> ");
                int deposit = sc.nextInt();

                balance += deposit;
                break;
            case 2: // 출금
                System.out.print("출금액> ");
                int withdrawl = sc.nextInt();

                if (balance >= withdrawl) {
                    balance -= withdrawl;
                } else {
                    throw new InsufficientBalance("잔고가 부족합니다.");
                }
                break;
            case 3: // 잔고
                System.out.print("잔고> ");
                System.out.println(balance);
                break;
            case 4: // 종료
                return false;
            default:
                throw new CommandRangeException("잘못 입력하셨습니다.");
        }
        return true;

    }
}