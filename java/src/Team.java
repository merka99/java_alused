import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int amount = 0;
        for (Player player : this.players) {
            amount += player.goals();
        }

        return amount;
    }
    public void addPlayer(Player player){
        if(this.size() >= this.maxSize) {
            return;
        }
        this.players.add(player);
    }
}
