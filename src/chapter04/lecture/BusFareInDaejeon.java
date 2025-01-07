package chapter04.lecture;

import java.util.Scanner;

public class BusFareInDaejeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("만 나이 입력: ");
        int age = sc.nextInt();

        // 버스요금 기준
        // 일반(19세 이상) : 1500원
        // 청소년(13세~18세) : 750원
        // 어린이(6세~12세) : 350원
        // 6세 미만 : 무료
        // 음수 입력할 경우 : "나이를 잘못 입력하셨습니다."
        int fare;
        if (age >= 19) {
            fare = 1500;
            System.out.println("요금은 " + fare + "입니다.");
        } else if (age >= 13) {
            fare = 750;
            System.out.println("요금은 " + fare + "입니다.");
        } else if (age >= 6) {
            fare = 350;
            System.out.println("요금은 " + fare + "입니다.");
        } else if (age >= 0) {
            fare = 0;
            System.out.println("요금은 " + fare + "입니다.");
        } else {
            System.out.println("나이를 잘못 입력하셨습니다.");
        }
    }
}
