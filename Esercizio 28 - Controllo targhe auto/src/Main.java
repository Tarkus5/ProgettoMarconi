/*
Acquisiamo una targa in un formato alfanumerico di 8 caratteri
SE la targa ha questa sequenza:  L=lettera  e D=numero
LLDDDDLL  autorizzato altri casi NO
es: AX74124SA  SI PUO' PARCHEGGIARE
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Acquisire la targa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la tua targa (8 caratteri)");
        String inputTarga = scanner.next();
        //Travasiamo i singoli caratteri in un array
        char[] targa = inputTarga.toCharArray();
        //Controllo targa auto (L L N N N N L L)
        boolean flagAuto = Character.isLetter(targa[0]) &&
                Character.isLetter(targa[1]) &&
                Character.isDigit(targa[2]) &&
                Character.isDigit(targa[3]) &&
                Character.isDigit(targa[4]) &&
                Character.isDigit(targa[5]) &&
                Character.isLetter(targa[6]) &&
                Character.isLetter(targa[7]);
        //Controllo targa moto (L L L L N N N N)
        boolean flagMoto = Character.isLetter(targa[0]) &&
                Character.isLetter(targa[1]) &&
                Character.isLetter(targa[2]) &&
                Character.isLetter(targa[3]) &&
                Character.isDigit(targa[4]) &&
                Character.isDigit(targa[5]) &&
                Character.isDigit(targa[6]) &&
                Character.isDigit(targa[7]);

        if (flagAuto) {
            System.out.println("Ingresso auto");
            System.out.println("Pedaggio richiesto: " + (2*5) + "€");
        } else if (flagMoto) {
            System.out.println("Ingresso moto");
            System.out.println("Pedaggio richiesto: " + (1.5*5) + "€");
        } else {
            System.out.println("Ingresso altri veicoli");
            System.out.println("Pedaggio richiesto: " + (3.5*5) + "€");
        }
    }
}