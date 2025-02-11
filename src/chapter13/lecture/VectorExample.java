package chapter13.lecture;

import java.util.List;
import java.util.Vector;

class Post {
    String subject; // 제목
    String content; // 내용
    String writer; // 작성자

    public Post(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Post{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                "}\n";
    }
}

public class VectorExample {
    public static void main(String[] args) {
        // Vector와 ArrayList가 다른 점은 동기화된 메서드로 구성되어있음
        // 멀티스레드가 동시에 Vector의 메소드들을 실행할 수 없음
        // 하나의 스레드가 메소드 실행을 완료해야만 멀티 스레드가 메소드를 수행할 수 있다.
        // 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있음

        List<Post> board = new Vector<Post>();

        board.add(new Post("제목1", "내용", "글쓴이1"));
        board.add(new Post("제목2", "내용", "글쓴이2"));
        board.add(new Post("제목3", "내용", "글쓴이3")); // 1. index 2 삭제
        board.add(new Post("제목4", "내용", "글쓴이4"));
        board.add(new Post("제목5", "내용", "글쓴이5")); // 2. index 3 삭제

        board.remove(2);
        board.remove(3);

        System.out.println(board);
    }
}
