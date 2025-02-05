package practice.vehicle;

// 자전거 클래스
public class Bicycle implements Vehicle {
    // 필드
    protected int geerCount; // 기어 단수

    protected String name; // 자전거 이름

    protected int speed; // 속도

    protected boolean IsBreak = false; // 브레이크 여부

    // getter와 setter 메서드


    public int getGeerCount() {
        return geerCount;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void move() {
        setGeerCount(3);
        setSpeed(20);
        System.out.println(getName() + " 자전거의 기어 단수를 "
                + getGeerCount() + "단 수로 바꾸고"
                + getSpeed() + "km만큼 달립니다.");
    }

    public void setGeerCount(int geerCount) {
        this.geerCount = geerCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void stop() {
        IsBreak = true;
        System.out.println("브레이크를 밟아서 자전거를 멈췄습니다.");
    }
}
