package chapter07.lecture;

public class Dog extends Animal {
    // String name; // 지어준 이름을 또... 선언?

    String specius;


    public Dog() {
        super("무명 강아지");
    }

    // 생성자
    public Dog(String name, String specius) {
        super(name);
        this.specius = specius;
    }

    @Override
    public void makeSound() {
        System.out.println(name + "가 멍멍 짖습니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "가 뛰어다닙니다.");
    }

}
