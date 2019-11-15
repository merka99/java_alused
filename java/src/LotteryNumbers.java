import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        while (this.numbers.size() < 7) {
            int newNumber = random.nextInt(39);
            boolean drawn = this.containsNumber(newNumber);

            if(!drawn){
                this.numbers.add(newNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        for (int olemas : this.numbers){
            if( olemas == number) {
                return true;
            }
        }
        return false;
    }
}