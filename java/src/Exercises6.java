import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Exercises6 {
/*
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    //ex 80
    /*
    public static void main(String[] args) {
        Dice dice = new Dice(6);

        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
    }
    //ex 78
    /*
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics stats = new NumberStatistics();

        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");

        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }

            sum.addNumber(number);

            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }

        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum odd: " + odd.sum());

    }

    //ex 77
    /*
    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);


        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20);
        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);


    }

    //ex 75
    /*
public static void main(String[] args) {
    DecreasingCounter counter = new DecreasingCounter(10);

    counter.printValue();

    counter.decrease();
    counter.printValue();

    counter.decrease();
    counter.printValue();

    counter.setInitial();
    counter.printValue();
}

    //ex 74
    /*
    public static void main(String[] args) {
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));
    }
    //ex 73
    /*
public static void main(String[] args){
    Product banana = new Product("Banaan", 1.1, 13);
   banana.printProduct();
    }

    /*
    // ex 72.3
    public static void main(String[] args) {
         Account accountA = new Account("Account A ", 100.0);
         Account accountB = new Account("Account B ", 0.0);
         Account accountC = new Account("Account C ", 0.0);

        System.out.println("Money before transfer " + accountA + accountB + accountC);

         transfer(accountA, accountB, 50.0);
         transfer(accountB, accountC, 25.0);
        System.out.println("Money after transfer " + accountA + accountB + accountC);
    }
    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
    //ex 72.2
        /*
         public static void main(String[] args) {
        Account account1 = new Account("Matt's account", 1000.0);
        Account account2 = new Account("My account", 0.0);

        account1.withdrawal(100.0);
        account2.deposit(100.0);

        System.out.println(account1 + " and " + account2);
    }


    //ex 72.1
    /*
    public static void main(String[] args) {

        Account account = new Account("Barto's account", 100.0);

        account.deposit(20);
        System.out.println(account);
    }


    /*
//ex 57-71
        public static void main(String[] args) {

            // You can change the values while testing
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();

            Collections.addAll(list1, 4, 3);


            Collections.addAll(list2, 5, 10, 7);

            combine(list1, list2);
            System.out.println(list1);
            System.out.println(list2);


        }

        public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
            first.addAll(second);
        }
 /*   public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int howMany = 0;
        for (int numbrid : list) {
            if (numbrid == number) {
                howMany = howMany + 1;
            }

            if (howMany > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }*/

    /*
    public static int greatest(ArrayList<Integer> list) {
        int suurim1 = list.get(0);
        for (int suur : list) {
            if (suur > suurim1) {
                suurim1 = suur;
            }
        }
        return suurim1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(10);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));

    /* public static void removeLast(ArrayList<String> brothers) {
        int viimanenimi = brothers.size() -1 ;
        brothers.remove(viimanenimi);
    }
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

// sorting brothers
        Collections.sort(brothers);

        // removing the last item
        removeLast(brothers);

        System.out.println(brothers);

     */
}
