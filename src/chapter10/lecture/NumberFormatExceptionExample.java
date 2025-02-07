package chapter10.lecture;

import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1 입력:");
        String s1 = sc.nextLine();
        System.out.print("정수2 입력:");
        String s2 = sc.nextLine();

        try {
            parseAndAdd(s1, s2);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }

    // throws는 이 method에서 발생할 수 있는 예외를 명시
    public static void parseAndAdd(String s1, String s2) throws NumberFormatException {
        // Integer 클래스는 정수형 객체 또는 포장(Wrapper) 클래스라고도 함
        // Integer.parseInt() 메소드를 이용하면 문자열을 정수로 변환 가능
        // parsing, NumberFormatException
        int value1 = Integer.parseInt(s1);
        int value2 = Integer.parseInt(s2);

        // 밑의 코드는 실행되지 않을 수 있음
        System.out.println(add(value1, value2));
    }

    public static int add(int v1, int v2) {
        return v1 + v2;
    }

}
