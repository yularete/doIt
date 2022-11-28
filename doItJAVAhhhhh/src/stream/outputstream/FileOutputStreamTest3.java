package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    public static void main(String[] args) throws IOException {
        //자바 9부터 제공하는 향상된 try-with-resources문
        FileOutputStream fos = new FileOutputStream("output3.txt");
        try(fos){
            byte[] bs = new byte[26];
            byte data = 65; //'a'의 아스키 값
            for (int i = 0; i < bs.length; i++){
                bs[i] = data;
                data++;
            }
            fos.write(bs, 2, 10);//배열의 3번[2]부터 10개의 바이트 출력
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("출력이 완료됐습니다.");
    }
}
