package JAVA_LAB.chapter8.inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer customerO = new VIPCustomer();
        customerO.setCustomerID(10020);
        customerO.setCustomerName("오렌지");
        customerO.bonusPoint = 10000;
        System.out.println(customerO.showCustomerInfo());
    }
}
