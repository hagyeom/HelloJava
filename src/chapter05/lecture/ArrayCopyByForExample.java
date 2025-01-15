package chapter05.lecture;

import chapter05.PrintArray;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};

        // 더 큰 길이의 배열을 만들어서 복사해보자
        // int[]newIntArray=oldIntArray; // 참조 주소 복사
        int[] newIntArray = new int[5];

        // 값을 복사를 for문을 이용해서 수행
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        PrintArray.printIntArray(newIntArray);
    }
}
