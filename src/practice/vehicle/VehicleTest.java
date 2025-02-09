package practice.vehicle;

// 메인 프로그램
public class VehicleTest {
    public static void main(String[] args) {
        // 각 차량 테스트
        Vehicle[] vehicles = {
                new Bicycle(),
                new Car("소나타", 0, 50),
                new Airplane("보잉747"),
                new TeslaCar("Model S", 0, 50),
                new GasCar("아반떼", 0, 40)
        };

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Bicycle) {
                ((Bicycle) vehicle).setName("자이언트");
            }
            vehicle.move();
            vehicle.stop();
            System.out.println("-------------------");
        }

        // 전기차 충전 테스트
        TeslaCar tesla = new TeslaCar("Model X", 0, 10);
        tesla.move();
        tesla.chargeBattery();
        tesla.move();

    }
}