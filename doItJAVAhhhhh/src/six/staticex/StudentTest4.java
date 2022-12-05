package six.staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student1 studentBam = new Student1();
        studentBam.setStudentName("밤브리");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentBam.studentName + " 학번:"+studentBam.studentID);

        Student1 studentO = new Student1();
        studentO.setStudentName("오렌지");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentO.studentName + " 학번:"+studentBam.studentID);

    }
}
