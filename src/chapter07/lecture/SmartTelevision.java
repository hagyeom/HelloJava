package chapter07.lecture;

public class SmartTelevision extends RemoteControlDevice implements RemoteControl, Searchable {

    // 필드
    private int volume;

    // region 원격 제어 인터페이스 구현
    @Override
    public void turnOn() {
        System.out.println("Smart Tv를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Tv를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME)
            this.volume = MAX_VOLUME;
        else if (volume < MIN_VOLUME)
            this.volume = MIN_VOLUME;
        else
            this.volume = volume;

        System.out.println("현재 SmartTv 볼륨 : " + this.volume);
    }
    // endregion

    // region 검색 가능 인터페이스 구현
    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
    // endregion
}
