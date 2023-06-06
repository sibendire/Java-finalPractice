package arrays.phone.interfaces;

public class SamSungPhone implements SamSung {
    private int myNumber;
    private boolean isRinging;
    private boolean isCharged;

    @Override
    public void powerOn() {
        if (isCharged) {
            System.out.println("The phone started successfully and first");

        }else {
            System.out.println("Your phone battery is to low please insert charger! ");
        }
        isCharged = true;
    }

    @Override
    public void answerCall() {
        if (isRinging){
            System.out.println("Receive your call");
            isRinging =false;
        }
    }

    @Override
    public void dail(int phoneNumber) {
    System.out.println("My phone number" + phoneNumber +"is valid");

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            System.out.println("number is from uganda");
        }else {
            System.out.println("number is from different country");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public boolean isConnectedToNetwork() {
        if (isConnectedToNetwork()){
            System.out.println("The phone is ringing");
        }
        return false;
    }
}
