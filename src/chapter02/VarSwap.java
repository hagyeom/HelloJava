package chapter02;

public class VarSwap {
    public static void main(String[] args) {
        // 변수 선언
        int a = 5;
        int b = 10;

        // a와 b의 값을 바꿔보기 (a = 10, b = 5)
        // 힌트 물컵과 주스 컵을 바꾸려면?
        int temp;
        temp = a;
        a = b;
        b = temp;

        // 출력
        System.out.println("a 값은 " + a);
        System.out.println("b 값은 " + b);
    }
}
