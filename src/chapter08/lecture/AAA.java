package chapter08.lecture;

// 멤버 클래스에서 사용 제한
// 안쪽에서 바깥에 필드나 메소드 접근
public class AAA {
    // 인스턴스 멤버
    int field1;

    void method1() {

    }

    // 정적 멤버
    static int field2;

    static void method2() {
    }

    // 내부 인스턴스 클래스
    class B {
        // 인스턴스 멤버 클래스의 인스턴스 메소드
        void method() {
            // 모든 필드와 메소드에 접근할 수 있음
            // B 객체가 생성된 시점에서는 A가 무조건 생성되어 있으므로 가능
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    // 내부 정적 클래스
    static class C {
        void method() {
            // 인스턴스 필드와 메소드는 접근할 수 없음
            // 처음에 메모리가 적재되는 시점에 AAA 객체가 생성되어있지 않기 때문
            // field1 = 10;
            // method1();

            field2 = 10;
            method2();
        }
    }
}
