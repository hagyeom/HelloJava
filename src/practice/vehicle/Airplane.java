package practice.vehicle;

// 비행기 클래스
public class Airplane implements Vehicle {
    private String name; // 이름
    private int speed; // 속도

    public Airplane(String name) {
        this.name = name;
    }

    // getter와 setter를 사용할 지 고민

    @Override
    public void move() {
        speed = 900;
        System.out.println(name + " 비행기가 이륙하여 " + speed + "km/h로 비행합니다.");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println(name + " 비행기가 착륙하여 멈췄습니다.");
    }
}
