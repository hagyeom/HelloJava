package chapter04;

import java.util.Random;
import java.util.Scanner;

public class FingerFlashing {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("0. 가위 1. 바위 2. 보 99. 종료");
        System.out.println("-------------------------------");
        System.out.print("입력 > ");

        int userHand = sc.nextInt();
        int computerHand = rand.nextInt(3); // 0 ~ 2 사이의 난수 발생

        System.out.print("컴퓨터가 낸 것 : ");
        displayHand(computerHand);

        System.out.print("내가 낸 것 : ");
        displayHand(userHand);

        displayResult(userHand, computerHand);
    }

    public static void displayHand(int hand) {
        switch (hand) {
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
            default:
                throw new RuntimeException("범위 밖의 커맨드 입력");
        }
    }

    public static void displayResult(int playerHand, int computerHand) {
        if (playerHand == computerHand) {
            System.out.println("비겼습니다.");
        } else if ((playerHand - computerHand == -2) || (playerHand - computerHand == 1) || (playerHand - computerHand == 1)) { // 이긴 상태
            System.out.println("당신이 이겼습니다.");
        } else {
            System.out.println("당신이 졌습니다.");
        }
    }
}
