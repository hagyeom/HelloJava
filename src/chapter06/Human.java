package chapter06;

public class Human {

    // 필드
    private String name; // 이름

    private int height; // 신장

    private int weight; // 체중

    // 생성자
    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    // 메서드
    void getWeight(int weight) {
        this.weight = weight;
    }

    void reduceWeight(int weight) {
        this.weight = weight;
    }

}
