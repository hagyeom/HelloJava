package chapter04.lecture;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 양의 정수를 입력 받아야 한다. (양의 정수를 입력 -> 반복 x)
        // 음의 정수를 입력하면 다시 입력을 요청한다. (음의 정수 입력 -> 반복)

        int number;

        System.out.print("양의 정수 입력 : ");

        do {
            number = sc.nextInt();
            if (number < 0)
                System.out.print("양의 정수를 다시 입력해 주세요 : ");
            
        } while (number < 0);

    }
}
