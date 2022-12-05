package JAVA_LAB.chapter8.inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

//    public VIPCustomer(){
//        customerGrade = "VIP";  //상위 클래스에서 private 변수이므로 오류 발생
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//        System.out.println("VIPCustomer() 생성자 호출");
//    }
    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade = "VIP";  //상위 클래스에서 private 변수이므로 오류 발생
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int, String) 생성자 호출");
}
    public int getAgentID(){
        return agentID;
    }
    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
