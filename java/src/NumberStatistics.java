public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int nr) {
        this.amountOfNumbers++;
        this.sum += nr;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        }

        return 1.0 * this.sum / this.amountOfNumbers;
    }
}
