import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner crea oggetti con i quali acquisire dati da esterno
        System.out.println("Uso della classe scanner");
        //Sintassi: NomeClasse + nomeOggetto = new nomeCostruttore (parametri...)
        Scanner scanner = new Scanner(System.in); //System.in --> legge dal sistema i dati in entrata
        //Uso l'oggetto tramite i metodi ---> nomeOggetto + .
        //Acquisizione valore intero
        System.out.println("Inserisci il tuo peso");
        int peso = scanner.nextInt();
        //Acquisizione valore float
        System.out.println("Inserisci la tua altezza (separata da virgole)");
        float altezza = scanner.nextFloat();
        //Acquisizione valore double
        System.out.println("Inserisci il tuo stipendio");
        double stipendio = scanner.nextDouble();
        //Acquisizione valore String
        System.out.println("Inserisci il tuo nome");
        String nome = scanner.next(); //Quando l'utente inserisce il valore prende solo la prima parola (Es. Vincenzo Rossi, prende solo "Vincenzo")
        System.out.println("Inserisci il nome completo");
        String nomeCompleto = scanner.nextLine(); //Acquisisce tutta la stringa inserita
        //Chiude lo scanner
        scanner.close();
    }
}