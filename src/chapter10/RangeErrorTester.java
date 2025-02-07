package chapter10;

import java.util.Scanner;

class RangeError extends RuntimeException {
    RangeError(int n, String typeName) {
        super(typeName + "범위 밖 값:" + n);
    }
}

class ParameterRangeError extends RangeError {
    ParameterRangeError(int n) {
        super(n, ParameterRangeError.class.getName());
    }
}

class ResultRangeError extends RangeError {
    ResultRangeError(int n) {
        super(n, ResultRangeError.class.getName());
    }
}

// 덧셈 계산기
// RangeError : 0 ~ 9가 아닌 범위 밖 에러 / 자식은 ParameterRangeError, ResultRangeError가 있음
// 입력되는 두 값은 범위 0~9에 속해야하며 아니면 예외를 발생 : ParameterRangeError (매개변수)
// return 되는 결과 값도 범위 0~9가 아니면 예외를 발생 : ResultRangeError (반환값)
public class RangeErrorTester {
    static boolean isValid(int n) {
        return n >= 0 && n <= 9;
    }

    // throw : 하나의 예외를 발생(실제로 예외를 던짐)
    // throws : 여러 개의 발생 가능한 예외를 선언할 수 있음. 이런 예외를 던질 수도 있어 (복수형의 느낌)
    static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
        if (!isValid(a))
            throw new ParameterRangeError(a);
        if (!isValid(b))
            throw new ParameterRangeError(b);

        int result = a + b;
        if (!isValid(result))
            throw new ResultRangeError(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();

        try {
            System.out.println("합은 " + add(a, b) + "입니다.");
        } catch (RangeError e) {
            System.out.println("범위 밖 예외가 발생했습니다.\n" + e.getMessage());
        }
    }
}
