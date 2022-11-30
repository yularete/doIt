package constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personBam = new Person(); // Person() <- 생성자
        personBam.name ="밤브리";
        personBam.weight = 750F;
        personBam.height = 9F;

        Person personO = new Person("오렌지",4,45);
    }
}
