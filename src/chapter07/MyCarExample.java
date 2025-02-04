package chapter07;

abstract class Tire {
    String brand;

    Tire(String brand) {
        this.brand = brand;
    }

    void roll() {
        System.out.println(brand + " 타이어가 굴러갑니다.");
    }

    abstract void broke();
}

class KumhoTire extends Tire {

    KumhoTire() {
        super("금호");
    }

    @Override
    void roll() {
        System.out.println(brand + " 타이어가 경쾌하게 굴러갑니다.");
    }

    @Override
    void broke() {
        System.out.println(brand + " 타이어가 고장났지만 30분 더 주행 가능합니다.");
    }

}

class HankookTire extends Tire {

    HankookTire() {
        super("한국");
    }

    @Override
    void roll() {
        System.out.println(brand + " 타이어가 부드럽게 굴러갑니다.");
    }

    @Override
    void broke() {
        System.out.println(brand + " 타이어가 고장나서 바로 교체가 필요합니다.");
    }

}

abstract class CarType {
    abstract void type();
}

class ElectricCar extends CarType {
    @Override
    void type() {
        System.out.println("이 차는 전기차입니다.");
    }
}

class GasCar extends CarType {
    @Override
    void type() {
        System.out.println("이 차는 휘발유차입니다.");
    }
}

class MyCar {

    Tire frontLeftTire;
    Tire frontRightTire;
    Tire rearLeftTire;
    Tire rearRightTire;
    CarType carType;


    public MyCar(Tire frontLeftTire, Tire frontRightTire, Tire rearLeftTire, Tire rearRightTire, CarType carType) {
        this.frontLeftTire = frontLeftTire;
        this.frontRightTire = frontRightTire;
        this.rearLeftTire = rearLeftTire;
        this.rearRightTire = rearRightTire;
        this.carType = carType;
    }

    void drive() {
        System.out.println("자동차가 주행 중입니다.");
        frontLeftTire.roll();
        frontRightTire.roll();
        rearLeftTire.roll();
        rearRightTire.roll();

        System.out.println("주행 중에 앞왼쪽 바퀴가 고장이 났습니다.");
        frontLeftTire.broke();
        System.out.println("주행 중에 뒷왼쪽 바퀴가 고장이 났습니다.");
        rearLeftTire.broke();
    }
}


public class MyCarExample {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성 불가
        // Tire tire = new Tire("금호");

        KumhoTire frontLeft = new KumhoTire();
        KumhoTire frontRight = new KumhoTire();

        HankookTire rearLeft = new HankookTire();
        HankookTire rearRight = new HankookTire();

        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();

        MyCar myElectricCar = new MyCar(frontLeft, frontRight, rearLeft, rearRight, electricCar);
        MyCar myGasCar = new MyCar(frontLeft, frontRight, rearLeft, rearRight, gasCar);

        System.out.println("전기차 테스트:");
        myElectricCar.drive();

        System.out.println();

        System.out.println("휘발유차 테스트:");
        myGasCar.drive();
    }
}
