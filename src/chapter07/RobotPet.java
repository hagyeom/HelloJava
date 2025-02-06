package chapter07;

public class RobotPet extends Pet {

    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    @Override
    public void introduce() {
        System.out.println("나는 로봇! 이름은 " + name + "입니다.");
        System.out.println("주인님의 이름은 " + masterName + "입니다.");
    }

    // 가사일 하기
    public void work(int sw) {
        switch (sw) {
            case 0:
                System.out.println("청소를 합니다.");
                break;
            case 1:
                System.out.println("세탁을 합니다.");
                break;
            case 2:
                System.out.println("밥을 합니다.");
                break;

        }
    }
}
