package chapter08.lecture;

// 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter_ {
    static String staticField = "정적 변수";

    String field = "Outter-field";

    void method() {
        System.out.println("Outter-method");
    }

    class Method {
        String field = "Nested-Field";

        void method() {
            System.out.println("Nestead-Method");
        }

        void print() {
            System.out.println(this.field);
            this.method();

            // 정적 멤버 접근
            System.out.println(Outter_.staticField);

            // 인스턴스 멤버 접근 (내 바깥의 AAA_객체에 접근하고 싶어... this 키워드 추가)
            System.out.println(Outter_.this.field);
            System.out.println();
        }
    }

}
