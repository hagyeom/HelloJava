package practice.example.factory;

import practice.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {
    // User 객체 생성 : 유일성 확보 힘듦.
    // 이름은 동명이인이 있을 수 있으나
    // 이름과 핸드폰 번호의 조합은 유일해야 함
    // 해당 객체를 생성하기 전에 이미 생성된 객체를 활용하는 방법 필요
    // 객체를 인스턴스화 할때 직접적으로 생성자를 호출하여 생성했는데,
    // 별도의 객체 생성의 역할을 하는 클래스 메서드를 통해 간접적으로 객체 생성 유도

    // User 객체를 저장하는 캐싱 저장소 역할
    private static final List<User> cache = new ArrayList<>();

    // 더미 데이터 생성
    static {
        cache.add(new User("윤하겸", "010-0000-0000"));
        cache.add(new User("박세빈", "010-0000-0001"));
        cache.add(new User("유근규", "010-0000-0002"));
        cache.add(new User("이유나", "010-0000-0003"));
        cache.add(new User("유현담", "010-0000-0004"));
    }

    public static User from(String name, String phoneNumber) {
        // 유저 생성
        User newUser = new User(name, phoneNumber);

        int i; // 카운터 변수, for문이 수행 종료될 때 i는 제일 마지막 사용자 index를 가짐

        if (cache.contains(newUser)) {
            return cache.get(cache.indexOf(newUser));
        } else {
            // i번째(저장해야할 빈 공간)에 새로 저장할 수 있음
            cache.add(newUser); // 새 객체 생성하여 i번 인덱스에 등록
        }
        return newUser;
    }

    public static List<User> getUsers() {
        return cache;
    }

    public static void displayUsers() {
        for (User user : cache) {
            System.out.println(user);
        }
    }
}
