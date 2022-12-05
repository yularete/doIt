package JAVA_LAB.chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerBam = new Customer();
        customerBam.setCustomerID(10010);
        customerBam.setCustomerName("밤브리");
        customerBam.bonusPoint = 1000;
        System.out.println(customerBam.showCustomerInfo());

        VIPCustomer customerO = new VIPCustomer();
        customerO.setCustomerID(10020);
        customerO.setCustomerName("오렌지");
        customerO.bonusPoint = 10000;
        System.out.println(customerO.showCustomerInfo());
    }
}
