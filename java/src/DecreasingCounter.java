public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int currentValue;
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.currentValue = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(this.value > 0){
            this.value--;
        }
    }
    public void zero() {
        if(this.value == 0){
            this.value = this.currentValue;
        }
    }
    public void setInitial() {
        this.value = this.initialValue;
    }
    // and here the rest of the methods
}