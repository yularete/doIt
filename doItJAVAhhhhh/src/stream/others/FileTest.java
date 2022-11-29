package stream.others;

import java.io.File;

public class FileTest {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/yula/git/doItJava/doItJAVAhhhhh/newFile.txt");
        file.createNewFile(); //실제 파일 생성

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.delete();
    }
}
