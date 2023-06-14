package methodsjava.generic;

import java.util.ArrayList;

public class Team {
    private String identity;
    int won = 0;
    int lost = 0;
    int tied = 0;
    int played = 0;

private ArrayList<Players> members = new ArrayList <>();
    public Team(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return identity;
    }
}
