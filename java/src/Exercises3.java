import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //ex 23
        System.out.println("Sisesta punktiga number: ");
        double number = Double.parseDouble(reader.nextLine());

        if (number < -30 | number < 41) {
            System.out.println(number);
        }


 /*// ex 22 küsib parooli senikaua kuni on õige
        System.out.println("Sinu parool: ");
        String parool = reader.nextLine();

        while(!"porgand".equals(parool)){
            System.out.println("vale parool, sisesta uuesti");
            parool = reader.nextLine();
        } if (parool.equals("porgand")) {
            System.out.println("Sisse logitud \n Saldus on et seda pole");
        }
*/

/*// ex 20
        System.out.println("Sinu kasutajanimi: ");
        String nimi = reader.nextLine();
        System.out.println("Sinu parool: ");
        String parool = reader.nextLine();

        if (nimi.equals("alex") && parool.equals("mightyducks")) {
            System.out.println("Sisse logitud");
        } else if (nimi.equals("emily") && parool.equals("cat"))  {
                System.out.println("Sisse logitud");
        } else {
            System.out.println("vale kasutajanimi või parool");
        }*/

        /*
       // ex 19
       System.out.println("Sisesta vanus: ");
        int number = Integer.parseInt(reader.nextLine());


        if (number > 0 && number < 120) {
            System.out.println("OK");
        } else {
            System.out.println("Võimatu");
        }*/

/*
// ex 18
        if (number < 30) {
            System.out.println("Läbi kukkunud");
        } else if ( number < 35){
            System.out.println("Hinne: 1");
        } else if ( number < 39){
            System.out.println("Hinne: 2");
        }  else if ( number < 44){
            System.out.println("Hinne: 3");
        }  else if ( number < 50){
            System.out.println("Hinne: 4");
        }  else if ( number < 61){
            System.out.println("Hinne: 5");
        }  else if ( number >=  61){
            System.out.println("Hinne: Ei lähe arvesse");
        }
*/


/*
     // ex 17
        System.out.println("Sisesta nr: ");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Sisesta teine nr: ");
        int number2 = Integer.parseInt(reader.nextLine());

        if (number1 > number2) {
            System.out.println("Suurem number on " + number1);
        } else if (number2>number1){
            System.out.println("Suurem number on " + number2);
        } else if (number1 == number2) {
            System.out.println("Mõlemad numbrid on sama väärtusega");
        }
*/

/*//ex 16
        if (number % 2 == 0) {
            System.out.println("Paaris number");
        } else {
            System.out.println("paaritu number");
        }*/

// Ex 15
       /* System.out.println("Sisesta enda vanus: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 18) {
            System.out.println("Oled täiskasvanu");
        } else {
            System.out.println("kasva veel");
        }*/

        // Exercise 14
       /* System.out.println("Sisesta nr: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("Positiivne");
        } else {
            System.out.println("Negatiivne number");
        }*/
    }
}