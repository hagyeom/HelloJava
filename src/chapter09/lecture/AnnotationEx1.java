package chapter09.lecture;

class Parent {
    void parentMethod() {

    }
}

class Child extends Parent {
    @Override
    void parentMethod() {
        // 오버라이딩 하는 메서드의 이름을 잘못 적었음, 오류 발생
    }
}

public class AnnotationEx1 {

}
