/*
Determinare segno zodiacale e stampare a video.
Giorno inzio = 20, 21, 22, 23, 24
Giorno fine = 19, 20, 21, 22, 23
Mesi = 12
*/

public class Main {
    public static void main(String[] args) {
        // Dichiaro le variabili corrispondenti ai giorni e mesi iniziali e finali
        int meseIniziale = 12;
        int meseFinale = 1;
        int giornoIniziale = 22;
        int giornoFinale = 20;

        // Scrivo il ciclo else if per andare a valutare ogni caso
        if (meseIniziale == 1 && meseFinale == 2 && giornoIniziale == 21 && giornoFinale == 19){
            System.out.println("Acquario");
        }
        else if (meseIniziale == 2 && meseFinale == 3 && giornoIniziale == 20 && giornoFinale == 20) {
            System.out.println("Pesci");
        }
        else if (meseIniziale == 3 && meseFinale == 4 && giornoIniziale == 21 && giornoFinale == 20) {
            System.out.println("Ariete");
        }
        else if (meseIniziale == 4 && meseFinale == 5 && giornoIniziale == 21 && giornoFinale == 20) {
            System.out.println("Toro");
        }
        else if (meseIniziale == 5 && meseFinale == 6 && giornoIniziale == 21 && giornoFinale == 21) {
            System.out.println("Gemelli");
        }
        else if (meseIniziale == 6 && meseFinale == 7 && giornoIniziale == 22 && giornoFinale == 22) {
            System.out.println("Cancro");
        }
        else if (meseIniziale == 7 && meseFinale == 8 && giornoIniziale == 23 && giornoFinale == 23) {
            System.out.println("Leone");
        }
        else if (meseIniziale == 8 && meseFinale == 9 && giornoIniziale == 24 && giornoFinale == 22) {
            System.out.println("Vergine");
        }
        else if (meseIniziale == 9 && meseFinale == 10 && giornoIniziale == 23 && giornoFinale == 22) {
            System.out.println("Bilancia");
        }
        else if (meseIniziale == 10 && meseFinale == 11 && giornoIniziale == 23 && giornoFinale == 22) {
            System.out.println("Scorpione");
        }
        else if (meseIniziale == 11 && meseFinale == 12 && giornoIniziale == 23 && giornoFinale == 21) {
            System.out.println("Sagittario");
        }
        else if (meseIniziale == 12 && meseFinale == 1 && giornoIniziale == 22 && giornoFinale == 20) {
            System.out.println("Capricorno");
        }
    }
}