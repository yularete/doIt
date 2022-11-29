package stream.serialization;

import java.io.*;

class Person implements Serializable {
                        //Serializable 인터페이스는 이 클래스를 직렬화하겠다는 의미로만 해석하세용
    //  버전 관리를 위한 정보
    private static final long serialVersionUID = -1503252402544036183L;
    String name;
    transient String job;


    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + "," + job;
    }
}
    public class SerializationTest {
        public static void main(String[] args) throws ClassNotFoundException {
            Person personAhn = new Person("안재용","대표이사");
            Person personKim = new Person("김철수","상무이사");

            try(FileOutputStream fos = new FileOutputStream("serial.out");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(personAhn); //writeObject() 메서드를 호출하면 pA, pK값이 파일에 쓰인다.
                oos.writeObject(personKim);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try(FileInputStream fis = new FileInputStream("serial.out");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                Person p1 = (Person)ois.readObject();
                Person p2 = (Person)ois.readObject();

                System.out.println(p1);
                System.out.println(p2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
