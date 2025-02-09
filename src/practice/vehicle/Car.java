package practice.vehicle;


// 자동차 클래스
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
        try {
            if (speed < 0) { // 속도는 음수가 될 수 없음.
                throw new IllegalStateException("자동차의 속도는 음수가 될 수 없습니다.");
            }
            this.speed = speed;

        } catch (IllegalStateException e) {
            System.out.println("예외 발생" + e.getMessage());
        }
    }

    public void setFuel(int fuel) {
        try {
            if (fuel < 0 || fuel > 100) {
                throw new IllegalArgumentException("연료 잔량이 0~100사이어야 합니다.");
            }
            this.fuel = fuel;
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 : " + e.getMessage());
        }
    }

    @Override
    public void move() {
        try {
            setFuel(-10); // 연료 직접 감소
            if (fuel <= 0) {
                throw new IllegalArgumentException("연료가 없어서 주행할 수 없습니다.");
            }
            setSpeed(50);
            System.out.println(name + " 자동차가 " + speed + "km/h로 주행합니다. 남은 연료: " + fuel + "%");
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 : " + e.getMessage());
        }
    }

    @Override
    public void stop() {
        setSpeed(0);
        System.out.println("자동차가 멈췄습니다.");
    }
}