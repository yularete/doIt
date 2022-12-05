package JAVA_LAB.chapter8.inheritance;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }
    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint +"입니다.";
    }
    public int getCustomerID(){         //protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get(), set() 메서드 추가
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerGrade(){
        return customerGrade;
    }
    public void setCustomerGrade(String customerGrade){
        this.customerGrade = customerGrade;
    }
}
