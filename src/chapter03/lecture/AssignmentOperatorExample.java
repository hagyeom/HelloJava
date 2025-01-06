package chapter03.lecture;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0; // 대입연산자

        result += 10;
        // result = result + 10;
        // result++는 result += 1 과 같다
        System.out.println("result = " + result); // 10

        result -= 5;
        System.out.println("result = " + result); // 5

        result *= 3;
        System.out.println("result = " + result); // 15

        result /= 5;
        System.out.println("result = " + result); // 3

        result %= 3;
        System.out.println("result = " + result); // 0
    }
}
