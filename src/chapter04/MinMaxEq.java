package chapter04;

import java.util.Scanner;

public class MinMaxEq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt();

        System.out.print("정수 b : ");
        int b = sc.nextInt();

        if (a == b)
            System.out.println("두 값이 같습니다.");
        else {
            int min, max;
            if (a < b) {
                max = b;
                min = a;
            } else { // a > b
                max = a;
                min = b;
            }
            System.out.println("큰 값은 " + max + "입니다.");
            System.out.println("작은 값은 " + min + "입니다.");
        }
    }
}
