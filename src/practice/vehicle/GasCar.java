package practice.vehicle;

public class GasCar extends Car {
    public GasCar(String name, int speed, int fuel) {
        super(name, speed, fuel);
    }

    @Override
    public void move() {
        if (getFuel() > 0) {
            setSpeed(80);
            setFuel(getFuel() - 15); // 연료 소모
            System.out.println(getName() + " 가솔린 차량이 " + getSpeed() + "km/h로 주행합니다. 남은 연료: " + getFuel() + "%");
        } else {
            System.out.println("연료가 없어 차가 주행할 수 없습니다.");
        }
    }
}
