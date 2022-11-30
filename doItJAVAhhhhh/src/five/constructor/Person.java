package five.constructor;

public class Person {
    String name;
    float height;
    float weight;

    public Person() {} //디폴트 생성자

    public Person(String name){ //이름을 매개변수로 입력받는 생성자
        name = pname;
    }
    public Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }
}
