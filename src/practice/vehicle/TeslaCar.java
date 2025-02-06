package practice.vehicle;

// Car 클래스를 상속받고 ElectricVehicle 인터페이스를 상속받는 전기차 클래스
public class TeslaCar extends Car implements ElectricVehicle {
    // 필드
    private int battery; // 배터리

    // 생성자 매개변수: 이름, 속도, 배터리
    public TeslaCar(String name, int speed, int battery) {
        super(name, speed, 0); // 연료 사용 안함
    }


    @Override
    public void move() {
        if (battery > 0) {
            setSpeed(100);
            battery -= 20;
            System.out.println(getName() + " 전기차가 " + getSpeed() + "km/h로 주행합니다. 남은 배터리: " + battery + "%");
        } else {
            System.out.println("배터리가 없어 주행할 수 없습니다.");
        }
    }

    @Override
    public void stop() {
        setSpeed(0);
        System.out.println(getName() + " 전기차가 " + "멈췄습니다.");
    }

    @Override
    public void chargeBattery() {
        battery = 100;
        System.out.println(getName() + "의 배터리를 충전했습니다.");
    }
}
