package practice.vehicle;

public class Car implements Vehicle {
    // 필드
    protected String name; // 이름

    protected int speed; // 속도

    protected int fuel; // 연료 양


    // 생성자

    public Car(String name, int speed, int fuel) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
    }


    // Getter와 Setter 메서드


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) { // 속도는 음수가 될 수 없음.
            this.speed = speed;
        }
    }

    public void setFuel(int fuel) {
        if (fuel >= 0 && fuel <= 100) { // 연료는 0% ~ 100%.
            this.fuel = fuel;
        }
    }

    @Override
    public void move() { // 좀 더 어떻게 잘 구현해볼지 다시 생각.
        if (fuel > 0) {
            setSpeed(50);
            setFuel(-10);
            System.out.println(name + " 자동차가 " + getSpeed() + "km로 주행합니다.");
        } else if (fuel <= 0) {
            System.out.println("차가 주행할 수 없습니다.");
        }
    }

    @Override
    public void stop() {
        setSpeed(0);
        System.out.println("자동차가 주행이 멈췄습니다.");
    }
}
