public class Reformatory {
public int weightsMeasured;


    public int weight(Person person) {
        this.weightsMeasured++;
        return person.getWeight();
    }
    public void feed(Person person) {
        int weightBeforeEating = person.getWeight();
        person.setWeight(weightBeforeEating + 1);
    }
    public int totalWeightsMeasured() {
        return weightsMeasured;
    }


}