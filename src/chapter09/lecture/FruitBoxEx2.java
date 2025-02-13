package chapter09.lecture;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        // FruitBox<Grape> errorBox = new FruitBox<Apple>(); // 타입 불일치
        // FruitBox<Toy>toyBox=new FruitBox<Toy>(); // 에러. T에 제한을 걸림

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        // appleBox.add(new Grape()); // Grape는 Apple의 자손이 아님

        grapeBox.add(new Grape());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
