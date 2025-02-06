package chapter07;

public abstract class HeadMountedDisplay implements Wearable, Skinnable, Display {
    private String vendor;

    private int skin;

    public HeadMountedDisplay() {
    }

    public HeadMountedDisplay(String vendor, int skin) {
        this.vendor = vendor;
        this.skin = skin;
    }

    public abstract void displayVRScene();

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    @Override
    public void putOn() {
        System.out.println("디스플레이를 착용했습니다.");
    }

    @Override
    public void putOff() {
        System.out.println("디스플레이를 벗었습니다.");
    }

    @Override
    public void show(String content) {
        System.out.println("[" + vendor + "사 제품] 화면에 표시: " + content);
    }

    public void putSkin() {
        switch (skin) {
            case BLACK:
                System.out.println("BLACK 색상");
                break;
            case RED:
                System.out.println("RED 색상");
                break;
            case GREEN:
                System.out.println("GREEN 색상");
                break;
            case BLUE:
                System.out.println("BLUE 색상");
                break;
            case YELLOW:
                System.out.println("YELLOW 색상");
                break;
        }
    }
}
