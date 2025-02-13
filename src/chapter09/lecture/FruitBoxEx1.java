package chapter09.lecture;

import chapter08.lecture.A;


public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
        // Box<Grape>errorBox=new Box<Apple>(); // 에러. 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // 과일 박스에 사과 추가 가능 이유(상속)

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        // appleBox.add(new Toy()); // 에러. Box<Apple>에는 사과 또는 사과의 자식만 담을 수 있음

        toyBox.add(new Toy());
        // toyBox.add(new Apple()); // 에러

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}


