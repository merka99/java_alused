import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercises5 {

    /*
    public static int countItems(ArrayList<String> list)  {
        return list.size();
    }
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<String>();
            list.add("Hallo");
            list.add("Ciao");
            list.add("Hello");
            System.out.println("There are this many items in the list:");
            System.out.println(countItems(list));


          /*  ArrayList<String> words = new ArrayList<String>();

            while (true) {
                System.out.println("Sisesta sõna: ");
                String word = reader.nextLine();
                if (word.isEmpty()) {
                    break;
                }
                words.add(word);
            }

            Collections.reverse(words); // v tähestilikuseks  Collections.sort(words);


            System.out.println("sa sisestasid: ");
            for (String word : words) {
                System.out.println(word);
            }

            /*

            while (true) {
                System.out.println("Sisesta sõna: ");
                String word = reader.nextLine();
                if (words.contains(word)) {
                    System.out.println("sa sisestasid 2x sama sõna " + word);
                    break;
                } else
                words.add(word);
            }



/*  ex week3 -57
            while (true) {
                System.out.println("Sisesta sõna: ");
                String word = reader.nextLine();
                if (word.isEmpty()) {
                    break;
                }
                words.add(word);
            }
            System.out.println("sa sisestasid: ");
            for (String word : words) {
                System.out.println(word);
            }


       /* String tagurpidi = "";

        int i = text.length() - 1;
        while (i >= 0) {
            tagurpidi += text.charAt(i);
            i--;
        }

        return tagurpidi;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("sisesta tekst: ");
        String text = reader.nextLine();
        System.out.println("tulemus: " + reverse(text));

        /*System.out.println("Sisesta sõna: ");
        String s1 = reader.nextLine();
        System.out.println("Sisesta teine:");
        String s2 = reader.nextLine();

        if (s1.indexOf(s2) != -1) {
            System.out.println(s2 + " on olemas esimeses sõnas " + s1);
        } else {
            System.out.println(s2 + "ei ole esimeses sõnas" + s1);
        }*/



       /* System.out.print("Sõna: ");
        String sona = reader.nextLine();
        System.out.print("Pikkus lõpust:  ");
        int n1 = Integer.parseInt(reader.nextLine());

        int algus = sona.length() - n1;
        System.out.print("Result: " + sona.substring(algus, sona.length()));
*/

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
