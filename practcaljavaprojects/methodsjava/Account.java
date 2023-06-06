public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmil;
    private String customerAddress;
    // This is the default constructor and its empty
    public Account(){
         // This is calling a constructor within a constructor of the same param
   this("12354", 1000.50, "default name", "default email",
           "default address");
    }
    public Account(String number, double balance, String customerName, String customerEmil,
                   String customerAddress) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmil = customerEmil;
        this.customerAddress = customerAddress;
    }

    public Account(String customerName, String customerEmil, String customerAddress) {
        this("142",123,customerName,customerEmil,customerAddress);

    }

    //create methods
    public void deposit(double depositAmount){
       this.balance += depositAmount;
        System.out.println("You have deposited " + depositAmount +"" + " New balance "  + this.balance);
    }
    public void withdraw(double withdrawAmount){
        if (this.balance - withdrawAmount <=0){
            System.out.println("only" + this.balance + " no available balance to withdraw ");
        }else {
           this. balance -= withdrawAmount;
            System.out.println("You have withdrawn "  + withdrawAmount + " Your new balance available :" + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmil() {
        return customerEmil;
    }

    public void setCustomerEmil(String customerEmil) {
        this.customerEmil = customerEmil;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
