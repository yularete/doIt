package five.classpart;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student1 = new Student();// 첫 번째 학생 생성
        student1.studentName = "밤브리";
        System.out.println(student1.getStudentName());

        Student student2 = new Student();// 두 번째 학생 생성
        student2.studentName = "오렌지";
        System.out.println(student2.getStudentName());
    }
}