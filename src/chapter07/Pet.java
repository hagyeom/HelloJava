package chapter07;

public class Pet {
    protected String name; // 애완견 이름
    protected String masterName; // 주인 이름

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    public String getName() {
        return name;
    }

    public String getMasterName() {
        return masterName;
    }

    // 자기소개
    public void introduce() {
        System.out.println("나의 이름은  " + name + "입니다.");
        System.out.println("주인님의 이름은 " + masterName + "입니다.");
    }
}
