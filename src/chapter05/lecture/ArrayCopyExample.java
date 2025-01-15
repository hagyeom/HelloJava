package chapter05.lecture;

import chapter05.PrintArray;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};

        String[] newStrArray = new String[5];

        // System.arraycopy(src(원본), srcPos(복사 시작 위치), dest(복사당할 배열), destPos(복사당할 대상의 시작지점), length(복사할 데이터 길이));
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
