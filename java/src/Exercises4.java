import java.util.Scanner;
import java.util.Random;

public class Exercises4 {

    public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    int numberDrawn = drawNumber();

    // program your solution here. Do not touch the above lines!

    int guessesMAde = 0;
        while (true) {
        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        guessesMAde++;

        if (guess == numberDrawn) {
            break;
        } else if (guess < numberDrawn) {
            System.out.println("The number is greater, guesses made: " + guessesMAde);
        } else {
            System.out.println("The number is lesser, guesses made: " + guessesMAde);
        }
    }

        System.out.println("Congratulations, your guess is correct!");
}

    private static int drawNumber() {
        return new Random().nextInt(101);


    /*
        public static void printText() {
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("mitu korda?");
            int kord = Integer.parseInt(reader.nextLine());
            while (kord > 0) {
                kord--;
                printText();
            }


            /* Scanner reader = new Scanner(System.in);

            int sum = 0;
            int numbers = 0;
            int even = 0;

            System.out.println("Type numbers:");
            while (true) {
                int number = Integer.parseInt(reader.nextLine());
                if (number == -1) {
                    break;
                }

                sum += number;
                numbers++;
                if (number % 2 == 0) {
                    even++;
                }
            }

            double average = (double) sum / numbers;
            int odd = numbers - even;
            System.out.println("Thank you and see you later!");
            System.out.println("The sum is " + sum);
            System.out.println("How many numbers: " + numbers);
            System.out.println("Average: " + average);
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);



       /* System.out.print("Sisesta nr: ");
        int n = Integer.parseInt(reader.nextLine());
        int tulemus = 0;

        int number = 0;
        while (number <= n) {
            int ruut = (int) Math.pow(2, number);
            tulemus = tulemus + ruut;
            number++;
        }

        System.out.println("tulemus " + tulemus);*/

    /* System.out.println("Sisesta number: ");
        int i = Integer.parseInt(reader.nextLine());
        int korrutis = 1;

        int number = 1;
        while (number <= i) {
            korrutis *= number;
            number++;
        }
        System.out.println("tulemus: " + korrutis);
*/
        /*
        System.out.println("Sisesta esimene arv: ");
        int i1 = Integer.parseInt(reader.nextLine());
        System.out.println("Sisesta teine arv: ");
        int i2 = Integer.parseInt(reader.nextLine());

        int summa = 0;

        while (i1 <= i2) {
            summa += i1;  // this is the same as result = result + 3;
            i1++;          // means the same as i = i+1;
        }
        System.out.println("Summa on:" + summa);
*/

      /*  System.out.println("Sisesta arv: ");
        int i = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int num = 1;

        while (num <= i) {
            sum += num;  // this is the same as result = result + 3;
            num++;          // means the same as i = i+1;
        }
        System.out.println("Summa on:" + sum);
*/

       /* // ex 31
        System.out.println("Sisesta arv kust numbririda algab: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Sisesta arv kuhuni numbririda jookseb: ");
        int number1 = Integer.parseInt(reader.nextLine());
        while (number <= number1 ) {
            System.out.println(number);
            number++;
        }*/

        //ex 30
       /* int number1 = 1;
        System.out.println("Sisesta arv kuhuni numbririda jookseb: ");
        int number = Integer.parseInt(reader.nextLine());
        while (number1 <= number ) {
            System.out.println(number1);
            number1++;
        }
*/
        // ex 29
      /*  int number = 2;

        while (number < 101 ) {
            System.out.println(number);
            number = number + 2 ;
        }*/


       /* //ex 28
        int number = 100;

        while (number >= 1 ) {
            System.out.println(number);
            number-- ;
        }*/



       /*// ex 27
        int number = 1;

        while (number < 101 ) {
            System.out.println(number);
            number ++ ;
        }
*/

        // ex 26
/*

        System.out.println("0 sisestades enam numbreid ei küsita: ");
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum = sum + read;
            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
*/


      /*  //ex 25

        System.out.println("sisesta kolm numbrit: ");
        int sum = 0;
        int read;

        System.out.println("Esimene nr: ");
        sum = Integer.parseInt(reader.nextLine());

        System.out.println("Teine: ");
        sum += Integer.parseInt(reader.nextLine());

        System.out.println("Kolmas: ");
        sum += Integer.parseInt(reader.nextLine());

        System.out.println("Summa: " + sum);*/
    }
}
