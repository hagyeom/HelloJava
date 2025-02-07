package chapter10.lecture;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2};


        // 예외 처리 예시 (try-catch-finally)

        try {
            System.out.println("intArray[0]: " + intArray[0]);
            System.out.println("intArray[1]: " + intArray[1]);
            // ArrayIndexOutOfBoundsException
            // RuntimeException의 일종으로 컴파일러에서 예외 처리를 강제하지 않는다.
            // 다만 실행 중에 해당 Exception이 발생 할 경우
            // 예외 처리를 하지 않으면 쓰레드가 강제 종료된다.
            System.out.println("intArray[2]: " + intArray[2]);

            System.out.println("프로그램 종료"); // 실행되지 않음
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally : 마지막에 수행됨");
        }
    }
}
