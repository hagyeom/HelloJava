package chapter07;

public class HeadMountedDisplayTester {
    public static void main(String[] args) {
        HeadMountedDisplay vrDevice = new HeadMountedDisplay("Meta", Skinnable.BLACK) {
            public void displayVRScene() {
                show("VR 장면을 렌더링 중");
            }
        };

        vrDevice.putOn(); // 착용
        vrDevice.putOff(); // 해제
        vrDevice.changeSkin(Skinnable.YELLOW); // 스킨 변경
        vrDevice.putSkin(); // 스킨 표시
        vrDevice.displayVRScene();

        Wearable w = vrDevice;
        w.putOn(); // 착용
        w.putOff(); // 해제

        Skinnable s = vrDevice;
        s.changeSkin(Skinnable.BLACK);

        vrDevice.putSkin(); // 스킨 표시
    }
}
