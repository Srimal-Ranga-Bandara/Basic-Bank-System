public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //depositFund method
    public void dipositeFund(double depositAmount){

        balance+=depositAmount;
        System.out.println("Deposit of $ "+depositAmount+" made.New balance is $ " + this.balance);
    }

    //withdrowFund method
    public void  withdrowFund(double withdrowalAmount){
        if(balance-withdrowalAmount<0){
            System.out.println("Insufficient Funds ! You only have $ "+balance+"in your account");
        }

        else{
            balance-=withdrowalAmount;
            System.out.println("Withdrowal of $ "+withdrowalAmount+" processed , Remaining balance = $ "+balance);
        }
    }

    //Getters

    public String getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }

    //Setters

    public void setNumber(String number) {
        this.number = number;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    

      

}
