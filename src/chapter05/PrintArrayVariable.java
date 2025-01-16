package chapter05;

public class PrintArrayVariable {
    public static void main(String[] args) {
        /*fianal*/
        int[] a = new int[5];
        // final로 상수처럼 주소 값을 고정할 수 있음
        // 주소 값이 고정이지 내부 요소 값은 바뀔 수 있음
        System.out.println("a = " + a); // 객체를 구별하기 위한 해시코드

        /*a = null;

        System.out.println("a = " + a);*/

        PrintArray.printIntArray(a);

        a[0] = 10;

        PrintArray.printIntArray(a);

        final double PI_OF_CIRCLE = 3.14;
        // PI_OF_CIRCLE=1.0; // 재할당 불가

        double PI = Math.PI;
    }
}
