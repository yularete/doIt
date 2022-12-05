package six.staticex;

public class StudentTest3 {
    public static void main(String[] args) {
        Student1 studentBam = new Student1();
        studentBam.setStudentName("밤브리");
        System.out.println(studentBam.serialNum);
        System.out.println(Student1.serialNum);
        System.out.println(studentBam.studentName + " 학번:"+studentBam.studentID);

        Student1 studentO = new Student1();
        studentO.setStudentName("오렌지");
        System.out.println(studentO.serialNum);
        System.out.println(Student1.serialNum);
        System.out.println(studentO.studentName + " 학번:"+studentBam.studentID);

    }
}
