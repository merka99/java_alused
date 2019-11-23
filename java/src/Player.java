public class Player {
    private String name;
    private int goals;

    public Player(String name) {
        this(name, 0);
    }
    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public int goals() {
        return this.goals;
    }

}
