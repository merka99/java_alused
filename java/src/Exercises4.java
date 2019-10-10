import java.util.Scanner;

public class Exercises4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
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
