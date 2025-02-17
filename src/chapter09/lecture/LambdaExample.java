package chapter09.lecture;

@FunctionalInterface // 추론 가능해야하기 때문에 메서드는 하나
interface MyFunction {
    int apply(int a, int b);

    /*int foo(int bar)*/
}

public class LambdaExample {
    public static void main(String[] args) {
        // int a = 1 + 2; // 연산한 결과를 대입
        // 연산하는 함수를 변수처럼 쓸 수 있음
        // 더하기 연산을 수행하는 람다식
        MyFunction add = (a, b) -> a + b;

        // 곱하기 연산을 수행하는 람다식
        MyFunction multiply = (a, b) -> a * b;

        // 람다식 호출 및 출력
        System.out.println("10 + 5 = " + add.apply(10, 5));
        System.out.println("5 + 5 = " + add.apply(5, 5));
        System.out.println("10 * 5 = " + multiply.apply(10, 5));
    }
}
