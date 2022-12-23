/*
Si scriva un algoritmo per stampare i primi venti numeri da 1 a 20
su righe da 5 numeri.
*/

public class Main {
    public static void main(String[] args) {
        //Generare i numeri da 1 a 20
        for (int i = 1; i <= 20; i++){
            System.out.print(i + " ");
            //Se la i == 5 || i == 10 || i == 15 vai su riga successiva
            if (i == 5 || i == 10 || i == 15){
                System.out.println();
            }
        }
    }
}