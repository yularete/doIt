package JAVA_LAB.chapter8.inheritance;

public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;

        Customer customerBam = new Customer(10010, "밤브리");
        System.out.println(customerBam.getCustomerName() + " 님이 지불해야 하는 금액은" + customerBam.calcPrice(price) +"원 입니다.");

        VIPCustomer customerO = new VIPCustomer(10020, "오렌지", 12345);
        System.out.println(customerO.getCustomerName() + " 님이 지불해야 하는 금액은"+ customerO.calcPrice(price) + "원 입니다.");

        Customer vc = new VIPCustomer(10030, "스미노", 2000);
        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은"+ vc.calcPrice(1000) + "원 입니다.");
    }
}
