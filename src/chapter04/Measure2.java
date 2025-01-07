package chapter04;

import java.util.Scanner;

public class Measure2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("변수 A : ");
        int a = sc.nextInt();

        System.out.print("변수 B : ");
        int b = sc.nextInt();

        // B는 A의 약수인가?
        if (!(a % b == 0)) //약수가 아닐 때
            System.out.println("B는 A의 약수가 아닙니다.");
        else    // 약수일 때
            System.out.println("B는 A의 약수입니다.");
    }
}
