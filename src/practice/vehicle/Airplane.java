package practice.vehicle;

// 비행기 클래스
public class Airplane implements Vehicle {
    private String name; // 이름
    private int speed; // 속도

    public Airplane(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    // 예외 처리
    public void setSpeed(int speed) {
        try {
            if (speed < 0) {
                throw new IllegalStateException("비행기의 속도는 음수가 될 수 업습니다.");
            }
            this.speed = speed;

        } catch (IllegalStateException e) {
            System.out.println("예외발생 : " + e.getMessage());
        }
    }

    // 비행기 속도가 음수가 되면 안되니깐 음수인 경우 예외처리
    @Override
    public void move() {
        try {
            if (getSpeed() <= 0) {
                throw new IllegalStateException("비행가의 속도는 음수가 될 수 없습니다.");
            }
            setSpeed(900);
            System.out.println(name + " 비행기가 이륙하여 " + speed + "km/h로 비행합니다.");
        } catch (IllegalStateException e) {
            System.out.println("예외 발생 : " + e.getMessage());
        }
    }

    @Override
    public void stop() {
        setSpeed(0);
        System.out.println(name + " 비행기가 착륙하여 멈췄습니다.");
    }
}