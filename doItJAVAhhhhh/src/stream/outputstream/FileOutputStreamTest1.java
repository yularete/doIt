package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
            fos.write(65); //FileOutputStream은 파일에 숫자를 쓰면 해당하는 아스키 코드 값으로 변환됨
            fos.write(66);
            fos.write(67);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료됐습니다.");
    }
}
