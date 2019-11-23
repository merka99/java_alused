public class Exercises7 {

    public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println(second + " and " + first + " difference in years: " + second.differenceInYears(first));

        System.out.println(third + " and " + first + " difference in years: " + third.differenceInYears(first));

        System.out.println(second + " and " + third + " difference in years: " + second.differenceInYears(third));
    }


// ex 91
        /*MyDate day = new MyDate(23, 11, 2019);
        MyDate newDate = day.afterNumberOfDays(7);
        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));
*/


    //ex 90
              /*  Team barcelona = new Team("FC Barcelona");

                Player brian = new Player("Brian");
                Player pekka = new Player("Pekka", 39);
                barcelona.addPlayer(brian);
                barcelona.addPlayer(pekka);
                barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

                System.out.println("Total goals: " + barcelona.goals());*/


//ex 86

        /*CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println( unicafeExactum );*/

            /*CashRegister unicafeExactum = new CashRegister();

            double theChange = unicafeExactum.payEconomical(10);
            System.out.println("the change was " + theChange );

            theChange = unicafeExactum.payEconomical(5);
            System.out.println("the change was "  + theChange );

            theChange = unicafeExactum.payGourmet(4);
            System.out.println("the change was "  + theChange );

            System.out.println( unicafeExactum );*/
       /*
        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );*/

//ex 85
        /*
        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

         */
}