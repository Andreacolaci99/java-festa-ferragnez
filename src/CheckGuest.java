
import java.util.Scanner;

public class CheckGuest{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti","Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

         System.out.println("Prego, inserire il proprio nome : ");

         String nomeOspite = scan.nextLine();

         boolean entra = false;

         int i = 0;

         while( i < invitati.length){

           if (nomeOspite.equals(invitati[i])) {

            entra = true ;  

           }
           
        i++;
     }
        if(entra){

            System.out.println(nomeOspite + " può entrare");

        }else{

            System.out.println(nomeOspite + " non è in lista");

    }
 }
}