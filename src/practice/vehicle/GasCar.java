package practice.vehicle;

// 석유나 휘발유 넣는?
public class GasCar extends Car {
    public GasCar(String name, int speed, int fuel) {
        super(name, speed, fuel);
    }
    
    @Override
    public void move() {
        try {
            setFuel(getFuel() - 15); // 연료 소모
            if (getFuel() < 0) {
                throw new IllegalStateException("연료가 없어 차가 주행할 수 없습니다.");
            }
            setSpeed(80);
            System.out.println(getName() + " 가솔린 차량이 " + getSpeed() + "km/h로 주행합니다. 남은 연료: " + getFuel() + "%");
            System.out.println();

        } catch (IllegalStateException e) {
            System.out.println("예외발생 : " + e.getMessage());
        }
    }
}