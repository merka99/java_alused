import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = reader.nextLine(); // Reads a line of input from the user and assigns it
        //     to the variable called name

        System.out.print("How old are u?:  ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Your name is: " + name + " and you are " + age + " aastat vana juba");
    }
}
