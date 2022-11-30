package classpart;

public class Student {

    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student studentBam = new Student();// Student 클래스 생성
        studentBam.studentName = "밤브리";

        System.out.println(studentBam.studentName);
        System.out.println(studentBam.getStudentName());
    }
}