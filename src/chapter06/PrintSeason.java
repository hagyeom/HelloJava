package chapter06;

import java.util.Scanner;

public class PrintSeason {
    public static void main(String[] args) {
        // 입력 범위에서 벗어날 경우 다시 입력 받기
        Scanner sc = new Scanner(System.in);

        int month;
        do {
            System.out.print("몇 월 입니까(1~12):");
            month = sc.nextInt();
        } while (month < 1 || month > 12);

        printSeason(month);
    }

    // 리턴 타입 void 또는 String
    // 봄 : 3, 4, 5월
    // 여름 : 6, 7, 8월
    // 가을 : 9, 10, 11월
    // 겨울 : 12, 1, 2월
    public static void printSeason(int m) {
        switch (m) {
            case 3:
            case 4:
            case 5:
                System.out.println("해당 월의 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("해당 월의 계절은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("해당 월의 계절은 가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("해당 월의 계절은 겨울입니다.");
                break;
        }
    }
}
