package chapter10;

import java.util.Scanner;

public class ThrowAndCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("sw(1. 검사예외 발생시키기 / 2. 비검사 예외 발생시키기):");
        int sw = sc.nextInt();

        try {
            test(sw);
        } catch (RuntimeException e) { // e: 예외 RuntimeException과 그 하위 클래스를 포착
            System.out.println(e.getMessage());
        } catch (Exception e) { // e: 예외 Exception과 그 하위 클래스를 포착
            // (위에 RuntimeException catch 블록이 있으므로 RuntimeException은 제외)
            System.out.println(e.getMessage());
        }
    }

    // 거쳐가는 메서드
    static void test(int sw) throws Exception {
        check(sw);
    }

    static void check(int sw) throws Exception {
        switch (sw) {
            case 1:
                // 검사 예외, 대처가 필수인 예외
                // try문 또는 throws 절에 명시하지 않으면 컴파일 오류가 발생
                throw new Exception("검사 예외 발생");
            case 2:
                // 비검사 예외 대처가 필수는 아닌 예외
                // try문 또는 trows 절에 명시하지 않아도 컴파일 오류가 발생하지는 않음
                throw new Exception("비검사 예외 발생");
        }
    }
}
