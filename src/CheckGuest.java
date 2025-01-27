
import java.util.Scanner;

public class CheckGuest{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti","Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

         System.out.println("Prego, inserire il proprio nome : ");

        for (int i = 0; i < invitati.length; i++) {

            String nomeOspite = scan.nextLine();

            switch (nomeOspite){

                case "Dua Lipa" :
                case "Paris Hilton":
                case "Manuel Agnelli":
                case "J-Ax":
                case "Francesco Totti":
                case "Ilary Blasi":
                case "Bebe Vio":
                case "Luis":
                case "Pardis Zarei":
                case "Martina Maccherone":
                case "Rachel Zeilic":
                System.out.println(nomeOspite + " è in lista !! Può entrare !!");
                break;
                default:
                System.out.println("Non sei in lista, puoi tornare da dove sei venuto !!");
            }
        }
    }
}