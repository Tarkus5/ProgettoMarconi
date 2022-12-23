import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inseriamo una stringa con la scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String stringaInput = scanner.nextLine();
        /*Mettiamo le singole lettere in un array di caratteri
        int dimensione = stringaInput.length();
        char[] arrayDati = new char[dimensione];
        for (int i = 0; i < arrayDati.length; i++){
            arrayDati[i] = stringaInput.charAt(i);
        }*/
        char[] arrayDati = stringaInput.toCharArray();
        //Stampo i dati
        for (char caratteri : arrayDati) {
            System.out.print(caratteri + " ");
        }
        System.out.println("\n");
        //Scambiamo le posizioni pari con quelle dispari dei caratteri
        //Ogni lettera con indice pari sarà scambiata con quella di indice dispari
        for (int i = 0; i < arrayDati.length-1; i++) {
            if (i % 2 == 0) {
                char tmp = arrayDati[i];
                arrayDati[i] = arrayDati[i + 1];
                arrayDati[i+1] = tmp;
            }
        }
        //Stampo l'array invertito
        for (char carattereInvertito : arrayDati ) {
            System.out.print(carattereInvertito + " ");
        }
    }
}
