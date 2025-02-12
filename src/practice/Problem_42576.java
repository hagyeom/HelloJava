package practice;

import java.util.*;

public class Problem_42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = solution(participant, completion);

        System.out.println(result);
    }

    public static String solution(String[] participant, String[] completion) {
        // 기존의 배열 (참여자들, 완료자들)
        // Map 객체로 변환해서 저장할건데... Map 객체는 몇 개가 필요할까?
        // 일단은 배열 하나는 Map 객체로 옮겨보자.
        // 옮기고 난 후에 1개로 활용 가능하면 그대로 쓰자. 필요하면 1개 더 선언하자.
        Map<String, Integer> nonCompletion = new HashMap<>();

        // 참가자 목록을 HashMap에 담기
        // 이름을 키로, 등장 횟수를 값으로 저장

        // 참가자 배열을 순회하면서 각 참가자의 이름을 HashMap에 저장
        for (String name : participant) {

            // 현재 참가자의 출현 횟수를 저장할 변수 선언 및 초기화
            int count = nonCompletion.getOrDefault(name, 0) + 1;
            nonCompletion.put(name, count);

            // region 다른 풀이
            /*// 현재 참가자의 출현 횟수를 저장할 변수 선언 및 초기화
            Integer value = nonCompletion.get(name);
            // 해당 참가자가 처음 등장하는 경우
            if (value == null) {
                // 기존 값이 없으면(null), 새로운 값 1을 저장
                nonCompletion.put(name, 1);
            } else {
                // 이미 존재하는 참가자라면 기존 값(value)을 가져와 1 증가
                nonCompletion.put(name, ++value);
            }*/
            // endregion
        }

        // 완주자 배열을 순회하면서 각 참가자의 value를 감소
        for (String name : completion) {
            int count = nonCompletion.get(name) - 1;

            if (count == 0) {
                nonCompletion.remove(name);
            } else {
                nonCompletion.put(name, count);
            }
        }

        // region for문 한번 더 도는 방법
        /*String result = "";

        for (String name : nonCompletion.keySet()) {
            if (nonCompletion.get(name) == 1) {
                result = name;
            }
        }*/
        // endregion

        /*Set<String> ketSet = nonCompletion.keySet();
        Iterator<String> iterator = ketSet.iterator();
        String result = iterator.next();*/

        return nonCompletion.keySet().iterator().next(); // return "mislav"
    }
}
