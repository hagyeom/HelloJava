package chapter14;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // 원본 파일 경로와 대상 파일 경로
        String sourceFilePath = args[0]; // 예시: C:/temp/source.txt
        String destFilePath = args[1]; // 예시: C:/temp.destination.txt

        // 파일 복사 작업
        try {
            if (isTextFile(sourceFilePath)) {
                copyTextFile(sourceFilePath, destFilePath);
            } else {
                copyBinaryFile(sourceFilePath, destFilePath);
            }
        } catch (IOException e) {
            System.out.println("파일 복사 중 오류가 발생했습니다: " + e.getMessage());
        }


    }

    // 이진 파일 복사 (FileInputStream, FileOutputStream 사용)
    // 이진파일 복사로 텍스트 파일 복사까지 다 해결 가능
    private static void copyBinaryFile(String sourceFilePath, String destFilePath) throws IOException {
        try (InputStream is = new FileInputStream(sourceFilePath)) {
            OutputStream os = new FileOutputStream(destFilePath);
            byte[] buffer = new byte[1024]; // 버퍼 크기: 1 kb
            int byteReadNum;

            // 파일을 1 kb씩 읽고, 읽은 만큼 쓰기
            while ((byteReadNum = is.read(buffer)) != -1) {
                os.write(buffer, 0, byteReadNum);
            }

            System.out.println("이진 파일이 성공적으로 복사되었습니다.");
        }
    }

    // 텍스트 파일 복사 (FileReader, FileWriter 사용)
    private static void copyTextFile(String sourceFilePath, String destFilePath) throws IOException {
        try (Reader reader = new FileReader(sourceFilePath)) {
            Writer writer = new FileWriter(destFilePath);

            char[] buffer = new char[1024];
            int charsReadNum;

            while ((charsReadNum = reader.read(buffer)) != -1) {
                reader.read(buffer, 0, charsReadNum);
            }
            System.out.println("텍스트 파일이 성공적으로 복사되었습니다.");
        }
    }

    // 텍스트 파일인지 판단하는 메소드 (확장자만 간단히 체크)
    // 파일 확장자의 경우 파일이 어떤 종류의 데이터를 포함하고 있는지 나타냄
    // 사용자가 적합한 프로그램을 통해 파일을 열 수 있도록 도와줌
    private static boolean isTextFile(String fileName) {
        return fileName.endsWith(".txt");
    }
}
