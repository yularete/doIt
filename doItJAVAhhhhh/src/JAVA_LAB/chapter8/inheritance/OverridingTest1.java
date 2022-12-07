package JAVA_LAB.chapter8.inheritance;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customerBam = new Customer(10010, "밤브리");
        customerBam.bonusPoint = 1000;

        VIPCustomer customerO = new VIPCustomer(10020, "오렌지", 12345);
        customerO.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerBam.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerBam.calcPrice(price) + "원입니다.");
        System.out.println(customerO.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerO.calcPrice(price) + "원입니다.");

    }
}
