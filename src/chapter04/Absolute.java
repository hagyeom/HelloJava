package chapter04;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값 : ");
        int n = sc.nextInt();

        int abs;

        // if(조건식) {실행문}
        // else(조건식) {실행문}

        if (n > 0) {
            abs = n;
        } else {
            abs = -n;
        }
        
        System.out.println("절대값은 " + abs + "입니다.");
    }
}
