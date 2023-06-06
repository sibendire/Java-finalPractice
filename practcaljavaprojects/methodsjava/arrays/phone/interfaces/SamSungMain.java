package arrays.phone.interfaces;

public class SamSungMain {
    public static void main(String[] args) {
        SamSungPhone joshphone = new SamSungPhone();
        joshphone.powerOn();
        joshphone.dail(1233);
        joshphone.callPhone(1233);
       // joshphone.isConnectedToNetwork();
        joshphone.callPhone(1233);
        joshphone.isRinging();
        joshphone.answerCall();
       SamSungS6 joshphone1 = new SamSungS6();
       joshphone1.isOn();
    }
}
