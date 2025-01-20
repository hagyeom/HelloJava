package practice;

class TV {
    public String brand;
    public int volume;
    public boolean isOn;

    public TV(String brand, int volume, boolean isOn) {
        this.brand = brand;
        this.volume = volume;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("TV가 켜졌습니다.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    public void increaseVolume() {
        if (isOn) {
            volume++;
            System.out.println("TV 볼륨이 " + volume + " 로 증가했습니다.");
        } else {
            System.out.println("TV가 꺼져 있습니다. 먼저 TV를 켜주세요.");
        }
    }

    public void decreaseVolume() {
        if (isOn) {
            volume--;
            System.out.println("TV 볼륨이 " + volume + " 로 감소했습니다.");
        } else {
            System.out.println("TV가 꺼져 있습니다. 먼저 TV를 켜주세요.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

public class TVTest {
    public static void main(String[] args) {
        TV myTV = new TV("삼성", 10, false);

        System.out.println(myTV.brand + " / " + myTV.volume + " / " + myTV.isOn + " / ");

        myTV.turnOn();

        myTV.increaseVolume();
        System.out.println("볼륨: " + myTV.getVolume());

        myTV.decreaseVolume();
        System.out.println("볼륨: " + myTV.getVolume());

        myTV.turnOff();
        System.out.println("TV 상태: " + (myTV.isOn() ? "켜져 있음" : "꺼져 있음"));
    }
}
