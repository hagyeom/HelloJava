package chapter10.lecture;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Dog로 형변환 하는 changeDog 메서드 호출
        Cat cat = new Cat();
        changeDog(cat); // ClassCastException이 발생하는 케이스
        // 타입 변환은 직계로 이루어진 상위, 하위 클래스 간 또는 인터페이스와 구현체 간에 가능
        // 위의 관계가 아니라면 ClassCastException이 발생하기 때문에
        // 타입 변환 전에 변환이 가능한지 instanceof 연산자로 확인이 필요

        System.out.println("프로그램 종료"); // 실행되지 않음
    }

    private static void changeDog(Animal animal) {
        // 예제라서 return 성략, 형변환만 진행
        // if (animal instanceof Dog) {
        Dog dog = (Dog) animal; // ClassCastException 발생
        // }
    }
}
