package chapter04;

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값 : ");
        int n = sc.nextInt();

        // if-then 문 : if(조건식) {실행문}
        // 조건식은 표현식과 다르게 boolean 형태로 return
        if (n < 0) // n < 0이 true(참)일 때 실행한다.
            System.out.println("이 값은 음의 정수입니다.");
    }
}