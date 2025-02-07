package chapter10.lecture;

public class NullPointerException {
    public static void main(String[] args) {
        String data = null;
        // NullPointerException 발생 : RuntimeException 일종
        // RuntimeException에 예외 처리 코드를 작성하지 않으면
        // 해당 예외가 발생했을 때 쓰레드가 바로 종료됨
        // 객체 참조가 없는 상태에서 즉 null 값을 갖는 참조 변수로
        // 객체 접근 연산자인 도트()를 사용했을 때 발생
        // System.out.println(data.toString());
        if ("유효한 데이터".equals(getDBData())) {
            System.out.println("성공!!!");
        }

        System.out.println("프로그램 종료"); // 실행되지 않음
    }

    // 데이터베이스에 요청해서 데이터를 가져온다.
    public static String getDBData() {
        // 내부 로직 생략
        // 찾는 데이터가 없어 null을 반환했다고 가정
        return null;
    }
}
