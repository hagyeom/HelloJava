package practice.example.factory;

// import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import practice.example.entity.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UserFactoryTest {

    @Test
    void from() {
        List<User> userList = UserFactory.getUsers();

        userList.clear(); // 유저 리스트 초기화

        int countBefore = userList.size(); // 길이 0

        // 사용자 2명을 추가하였으나 중복 데이터로 1개만 추가가 되야함
        User user1 = UserFactory.from("홍길동", "010-0000-0006");
        User user2 = UserFactory.from("홍길동", "010-0000-0006");

        int countAfter = userList.size(); // 길이 1이 되야함

        assertThat(countAfter).isEqualTo(countBefore + 1);
        assertThat(user1).isSameAs(user2);
    }
}