public class LyyraCard {
    private double balance;
    private final double economical = 2.5;
    private final double gourmet = 4.0;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= economical) {
            this.balance -= economical;
        }
    }

    public void payGourmet() {
        if (this.balance >= economical) {
            this.balance -= gourmet;
        }
    }
    public void loadMoney(double amount) {
        if (amount < 0){
            return;
        }
        this.balance += amount;
        if (this.balance > 150){
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}