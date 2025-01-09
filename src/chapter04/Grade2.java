package chapter04;

import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.print("점수:");
        int point = sc.nextInt();

        // 수우미양가 순으로 성적 판별
        if (point < 0 || point > 100) {
            System.out.println("잘못된 점수입니다.");
        } else if (point >= 80) { // 80 ~ 100
            System.out.println("수");
        } else if (point >= 70) { // 70 ~ 79
            System.out.println("우");
        } else if (point >= 60) { // 60 ~ 69
            System.out.println("미");
        } else if (point >= 50) { // 50 ~ 59
            System.out.println("양");
        } else { // 0 ~ 49
            System.out.println("가");
        }

    }
}
