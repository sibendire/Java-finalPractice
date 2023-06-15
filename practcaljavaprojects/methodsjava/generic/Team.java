package methodsjava.generic;

import java.util.ArrayList;

public class Team <T>{
    private String identity;
    int won = 0;
    int lost = 0;
    int tied = 0;
    int played = 0;

private ArrayList<Players> members = (ArrayList<Players>) new ArrayList <T>();
    public Team(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return identity;
    }
    /*
    This is a method that adds a player to the list
    But you need to first check if the player is on the list
     */
    public boolean addPlayers(Players players){
       if (members.contains(players)){
           System.out.println(players.getIdentity() + "is already on the team");
           return false;
       }else {
           members.add(players);
           System.out.println(players.getIdentity() + " add to team" + this.identity);
           return true;
       }
    }
    /*
    * use generic to check the list size of players
    * */
    public int numPlayers(){
        return this.members.size();
    }
    /*
    * Check the results
    * */
    String message;
    public void matchResults(Team Opponent, int ourScore,int theirScore ){
        if (ourScore > theirScore){
            won++;
            System.out.println("you have won the game"+ message);
        } else if (ourScore == theirScore) {
           tied++;
        }else {
            lost++;
        }
        played++;
        if (Opponent != null){
            Opponent.matchResults(null,ourScore,theirScore);
        }
    }
    public int ranking(){
        return (won * 2) + tied;
    }
}
