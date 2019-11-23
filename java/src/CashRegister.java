public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold
    private double economicalLunch = 2.5;
    private double gourmetlLunch = 4.0;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }
    //.3

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() < economicalLunch) {
            return false;
        }
       card.pay(economicalLunch);
        this.economicalSold++;
        return true;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() < gourmetlLunch) {
            return false;
        }
        card.pay(gourmetlLunch);
        this.gourmetSold++;
        return true;
    }


public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
        if (cashGiven < economicalLunch) {
            return cashGiven;
        }
        this.cashInRegister += economicalLunch;
        this.economicalSold++;
        return cashGiven - economicalLunch;
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
        if (cashGiven < gourmetlLunch) {
            return cashGiven;
        }
        this.cashInRegister += gourmetlLunch;
        this.gourmetSold++;
        return cashGiven - gourmetlLunch;
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
