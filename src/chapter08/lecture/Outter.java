package chapter08.lecture;

// 로컬 클래스에서 사용 제한
public class Outter {
    // 자바 7 이전 : final 강제
    public void method1(final int arg) {
        final int localVariable = 1;
        // arg = 100;
        // localVariable = 100;

        class Inner {
            public void method() {
                // 컴파일 시 로컬 클래스에서 사용하는 매개변수나 로컬 변수의 값을 로컬 클래스 내부에 복사
                int result = arg + localVariable;
            }
        }
    }

    // 자바 8 이후 : final을 강제하진 않으나 값 변경 있을 시 컴파일 에러 발생 가능
    public void method2(int arg) {
        int localVariable = 1;
        // arg = 100;
        // localVariable = 100;

        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }
}
