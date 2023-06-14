package methodsjava.generic;

public class PlayerMain {

    /*
    * Create objects for all classes
    * */
    public static void main(String[] args) {
 Football football = new Football("mesi");
 Baseball baseball = new Baseball("moses");
 Soccer soccer = new Soccer("mpape");

 Team manu = new Team("manu");
 manu.addPlayers(new Players("mesi"));
 manu.addPlayers(new Players("moses"));
 manu.addPlayers(new Players("mpape"));
        System.out.println(manu.numPlayers());

    }
}
