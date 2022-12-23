import java.util.Scanner;

/*
Dato in input un numero n visualizzare in output un quadrato vuoto di
asterischi di lato n
Es: Input: n=4 Output:
****
*  *
*  *
****
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserire la grandezza del lato");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) { //for per le righe
            for (int j = 0; j < n; j++) { //for per le colonne
                if (i == 0 || j == 0 || i == (n - 1) || j == (n - 1)) { //condizione di stampa
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
