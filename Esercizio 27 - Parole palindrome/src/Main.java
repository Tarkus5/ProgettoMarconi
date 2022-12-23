import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Parole palindrome -- OSSO, IDI, OTTO, RADAR
        //Acquisizione della parola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola ");
        String parola = scanner.next();
        String reverse = "";
        //Reverse
        for (int i = parola.length() - 1; i >= 0; i--){
            reverse = reverse + parola.charAt(i);
        }
        //Usiamo l'equals per confrontare la stringa di partenza con quella invertita
        boolean flag = parola.equalsIgnoreCase(reverse);
        if (flag){
            System.out.println("La parola è palindroma");
        }
        else{
            System.out.println("La parola non è palindroma");
        }
    }
}