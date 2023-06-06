public class ChallengeVip {
    private String name;
    private double creditLimit;
    private String email;


    public ChallengeVip(){
        this("default name","default@email",5000000.00);
    }
    public ChallengeVip(String name, double creditLimit) {
        this(name,"unknown@email.com",creditLimit);

    }

    public ChallengeVip(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
