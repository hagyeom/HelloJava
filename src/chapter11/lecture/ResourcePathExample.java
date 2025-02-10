package chapter11.lecture;

public class ResourcePathExample {
    public static void main(String[] args) {
        Class clazz = ResourcePathExample.class;

        // 현재 참조하는 클래스의 경로에서 photo1.png 찾은 다음 경로를 리턴
        String photo1Path = clazz.getResource("photo1.png").getPath();

        // 현재 참조하는 클래스의 경로에서 photo2.png 찾은 다음 경로를 리턴
        String photo2Path = clazz.getResource("images/photo2.png").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);
    }
}
