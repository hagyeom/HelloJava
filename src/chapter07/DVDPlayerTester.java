package chapter07;

public class DVDPlayerTester {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.powerOn();
        dvdPlayer.insertDVD("세시간짜리영화", 7200); // 세 시간짜리 영화
        dvdPlayer.play();
        dvdPlayer.stop();
        dvdPlayer.ejectDVD();
        dvdPlayer.powerOff();
    }
}
