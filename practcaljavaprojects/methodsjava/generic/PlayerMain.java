package methodsjava.generic;

public class PlayerMain {

    /*
    * Create objects for all classes
    * */
    public static void main(String[] args) {
 Football mesi = new Football("mesi");
 Baseball joshua = new Baseball("joshua");
 Soccer sarah = new Soccer("sarah");

 Team manu = new Team("manu");
 manu.addPlayers(mesi);
 manu.addPlayers(joshua);
 manu.addPlayers(sarah);
        System.out.println(manu.numPlayers());

    }
}
