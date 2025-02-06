package chapter07;

public class DVDPlayer implements Player {

    private boolean isOn; // 전원 상태 (켜져 있는지)
    private boolean isPlaying; // 재생 상태
    private String currentDVD; // 현재 삽입된 DVD
    private int currentTime; // 현재 재생 시간 (초 단위)
    private int totalTime; // 총 재생시간(초 단위)


    // 생성자
    public DVDPlayer() {
        this.isOn = false;
        this.isPlaying = false;
        this.currentDVD = null;
        this.currentTime = 0;
        this.totalTime = 0;
    }


    // 전원 켜기
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("DVD 플레이어 전원을 켭니다.");
        } else {
            System.out.println("DVD 플레이어 전원이 이미 켜져 있습니다.");
        }
    }

    // 전원 끄기 메서드
    public void powerOff() {
        if (isOn) {
            isOn = false;
            isPlaying = false;
            currentDVD = null;
            currentTime = 0;
            totalTime = 0;
            System.out.println("DVD 플레이어가 꺼졌습니다.");
        } else {
            System.out.println("DVD 플레이어가 이미 꺼져 있습니다.");
        }
    }

    // DVD 삽입 메서드
    public void insertDVD(String dvdTitle, int totalTime) {
        if (isOn) {
            if (currentDVD == null) {
                currentDVD = dvdTitle;
                this.totalTime = totalTime; // getter랑 setter 메서드 사용?
                currentTime = 0;
                System.out.println(dvdTitle + " DVD가 삽입되었습니다. 총 재생시간은 " + totalTime + "초입니다.");
            } else {
                System.out.println("이미 " + currentDVD + " DVD가 삽입되었습니다.");
            }
        } else {
            System.out.println("DVD 플레이어 전원이 꺼져 있습니다. 면저 전원을 켜주세요.");
        }
    }

    // DVD 꺼내기 메서드
    public void ejectDVD() {
        if (isOn) {
            if (currentDVD != null) {
                System.out.println(currentDVD + " DVD를 꺼내졌습니다.");
                currentDVD = null;
                isPlaying = false;
                currentTime = 0;
                totalTime = 0;
            } else {
                System.out.println(currentDVD + " DVD는 이미 꺼내져 있습니다.");
            }
        } else {
            System.out.println("DVD 플레이어 전원이 꺼져 있습니다. 면저 전원을 켜주세요.");
        }
    }

    @Override
    public void play() {
        if (isOn) {
            if (currentDVD != null) {
                if (!isPlaying) {
                    isPlaying = true;
                    System.out.println(currentDVD + " DVD를 재생합니다. (" + currentTime + "초)");
                } else {
                    System.out.println(currentDVD + " DVD는 이미 재생 중입니다.");
                }
            } else {
                System.out.println("DVD가 없습니다. 먼저 DVD를 넣어주세요.");
            }
        } else {
            System.out.println("DVD 플레이어 전원이 꺼져 있습니다. 면저 전원을 켜주세요.");
        }
    }

    @Override
    public void stop() {
        if (isOn) {
            if (isPlaying) {
                isPlaying = false;
                System.out.println(currentDVD + " DVD 재생이 중지되었습니다.");
            } else {
                System.out.println(currentDVD + " DVD 재생이 이미 중지되어 있습니다.");
            }
        } else {
            System.out.println("DVD 플레이어 전원이 꺼져 있습니다. 면저 전원을 켜주세요.");
        }
    }

}
