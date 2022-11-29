package stream.serialization;

import java.io.*;

import static java.lang.System.*;

class Dog implements Externalizable {
    String name;

    public Dog() {}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        }

    public String toString() {
        return name;
        }
    }

    public class ExternalizableTest {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            Dog myDog = new Dog();
            myDog.name = "밤브리";

            FileOutputStream fos = new FileOutputStream("external.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try(fos; oos){
                oos.writeObject(myDog);
            } catch (IOException e) {
            e.printStackTrace();
            }
            FileInputStream fis = new FileInputStream("external.out");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Dog dog = (Dog)ois.readObject();
            out.println(dog);
        }
    }

