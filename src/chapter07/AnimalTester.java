package chapter07;

public class AnimalTester {
    public static void main(String[] args) {
        // 다음 선언은 오류 : 추상 클래스는 인스턴스화 불가
        // Animal animal = new Animal();
        // 하지만 익명 객체, 구현체를 통해 선언이 가능하긴 함...
        /*Animal animal = new Animal("원숭이") {
            @Override
            public void bark() {
                System.out.println("우끼끼");
            }
        };*/

        Animal[] animals = new Animal[2];

        animals[0] = new Dog("초코", "치와와");
        animals[1] = new Cat("나비", 7);

        /*for (Animal animal : animals) {
            System.out.print(animal.getName() + " : ");
            animal.bark();
            System.out.println();
        }*/

        for (int i = 0; i < animals.length; i++) {
            System.out.println("animal[" + i + "] = " + animals[i].toStr());
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.print("animal[" + i + "] = ");
            animals[i].introduce();
        }
    }
}

