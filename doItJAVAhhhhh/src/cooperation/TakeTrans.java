package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentBam = new Student("Bam", 5000);
        Student studentBuri = new Student("Buri", 10000);

        Bus bus100 = new Bus(100);
        studentBam.takeBus(bus100);
        studentBam.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentBuri.takeSubway(subwayGreen);
        studentBuri.showInfo();
        subwayGreen.showInfo();
    }
}
