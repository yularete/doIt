package classpart;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student1 = new Student(); // 인스턴스 생성
        student1.studentName = "밤브리";

        Student student2 = new Student();
        student2.studentName = "오렌지";

        System.out.println(student1); //참조 변수 값 출력
        System.out.println(student2);
    }
}
