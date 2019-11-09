import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Sõna: ");
        String sona = reader.nextLine();
        System.out.print("Length of the end part:  ");
        int n1 = Integer.parseInt(reader.nextLine());

        int algus = sona.length() - n1;
        System.out.print("Result: " + sona.substring(algus, sona.length()));


// ex 43-46
        /*
        Scanner reader = new Scanner(System.in);
        System.out.print("Nimi: ");
        String name = reader.nextLine();

        int i = 0;
        while (i < name.length()) {
            System.out.println((i + 1) + " täht " + name.charAt(i));
            i++;
        }
        /* public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      System.out.print("Nimi: ");
    String name = reader.nextLine();
        System.out.print("Esimene täht on : " +firstCharacter(name));
}

    public static char firstCharacter(String text) {
        return text.charAt(0);


        /* public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      System.out.print("Nimi: ");
    String name = reader.nextLine();
        System.out.print("Kohti on : " + calculateCharacters(name));
}

    public static int calculateCharacters(String text) {
        return text.length();

   /* public static int summa (int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    public static double average(int n1, int n2, int n3, int n4) {
        int summa = summa(n1, n2, n3, n4);

        return (double) summa / 4;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
        */

}
}