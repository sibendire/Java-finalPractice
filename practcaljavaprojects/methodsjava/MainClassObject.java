public class MainClassObject {
    public static void main(String[] args) {
       /**ObjectsCar porsche = new ObjectsCar();
        porsche.setCar(2451);
        System.out.println("This is your car number " + porsche.getCar());
        ObjectsCar blue = new ObjectsCar();
        blue.setColour("green");
        System.out.println("This is your colour " + blue.getColour());
     */
        Account bank = new Account("1223483",90000.00,"joshua",
                "joshua@gmail.com","Bundibugyo");
        System.out.println(bank.getBalance());
        System.out.println(bank.getNumber());
        System.out.println(bank.getCustomerName());
        System.out.println(bank.getCustomerEmil());
        System.out.println(bank.getCustomerAddress());


       /** bank.setBalance(1000000.00);
        bank.setNumber("12334");
        bank.setCustomerName("joshua");
        bank.setCustomerEmil("joshua@gmail.com");
        bank.setCustomerAddress("Bundibugyo");
        */
        bank.deposit(100000);
        bank.deposit(500000);
        bank.withdraw(100000);
        Account joshuaAccount = new Account("joshua","sibendire@gmail.com",
                "Kampala");
        System.out.println(joshuaAccount.getCustomerEmil());
        // challenge test
        ChallengeVip person = new ChallengeVip();
        person.getName();

        ChallengeVip person1 = new ChallengeVip("Mosese",200000);
        System.out.println(person1.getName());
    }
}
