package chapter09.lecture;


import java.util.ArrayList;

public class AnnotationEx3 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.oldField = 10; // Deprecated가 붙은 대상을 사용
        System.out.println(nc.getOldField()); // Deprecated가 붙은 대상을 사용

        @SuppressWarnings("uncheked") // 지네릭스 관련 경고 억제
        ArrayList list = new ArrayList(); // 타입을 지정하지 않음
    }
}
