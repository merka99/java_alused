import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //ex 23
        System.out.println("Sisesta punktiga numbreid(5 numbrit -31 ja 41 vahel): ");

        int correctNumberCount = 0;
        while (correctNumberCount < 5) {
            double number = Double.parseDouble(reader.nextLine());
            if (number > - 31 && number < 41) {
                correctNumberCount += 1;
                Graph.addNumber(number);
            }
        }
    }
}