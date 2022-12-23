import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il lato della stella");
        int lato = scanner.nextInt();
        for (int i = 1; i <= lato; i++) { //Colonne
            for (int j = lato; j >= i; j--) { //Righe
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) { //Disegna righe dispari
                System.out.print("*");
            }
            System.out.println(""); //Il for esterno di colonna ha raggiunto il massimo == lato
        }
        //Parte il triangolo al contrario
        for (int a = lato; a >= 1; a--){ //Colonne
            for (int b = lato; b >= a; b--){
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
