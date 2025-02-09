package practice.vehicle;

// 자전거 클래스
public class Bicycle implements Vehicle {
    protected int gearCount; // 기어 단수
    protected String name; // 이름
    protected int speed; // 속도
    protected boolean isBreak = false; // 브레이크 밟았는지 여부

    // Getter & Setter
    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        try {
            if (speed < 0) {
                throw new IllegalStateException("자전거의 속도는 음수가 될 수 없습니다.");
            }
            this.speed = speed;
        } catch (IllegalStateException e) {
            System.out.println("예외발생 : " + e.getMessage());
        }
    }

    @Override
    public void move() {
        setGearCount(3);
        setSpeed(20);
        System.out.println(getName() + " 자전거의 기어 단수를 "
                + getGearCount() + "단으로 바꾸고 "
                + getSpeed() + "km/h로 달립니다.");
    }

    @Override
    public void stop() {
        isBreak = true;
        System.out.println("브레이크를 밟아 자전거를 멈췄습니다.");
    }
}