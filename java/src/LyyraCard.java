public class LyyraCard {
   // week 5
       private double balance;

       public LyyraCard(double balance) {
           this.balance = balance;
       }

       public double balance() {
           return this.balance;
       }

       public void loadMoney(double amount) {
           this.balance += amount;
       }

       public boolean pay(double amount){
           // the method checks if the balance of the card is at least the amount given as parameter
           // if not, the method returns false meaning that the card could not be used for the payment
           // if the balance is enough, the given amount is taken from the balance and true is returned
           if (this.balance < amount) {
               return false;
           }

           this.balance -= amount;

           return true;
       }



       //week 4
    /* private double balance;
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

     */
}