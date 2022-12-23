public class Main {
    public static void main(String[] args) {
        //Possiamo inserire numeri casuali attraverso l'uso della classe MATH
        int limiteSuperiore = 10;
        int limiteInferiore = 1;
        int range = (limiteSuperiore - limiteInferiore) + 1;

        // Scegliamo un numero compreso tra 1 e 10
        int mioNumero = 5;

        //Stampiamo dieci numeri (tra 1 e 10) casuali con un for
        System.out.print("Numero generato casualmente: ");
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * range) + limiteInferiore; //Si tratta di una classe ed un metodo statico
            System.out.print(numero + " ");
            if (mioNumero == numero) {
                System.out.println("\n" + "Trovata corrispondenza dopo " + (i+1) + " tentativi");
                break; //Quando trova la corrispondenza, interrompe il ciclo

            }
        }
        System.out.println("Fine del programma con il ciclo FOR");
        System.out.println("\n");
        System.out.println("Inizio programma con il ciclo WHILE");
        int ciclo = 0;
        System.out.print("Numero generato casualmente: ");
        while (ciclo < 10) {
            int numero = (int) (Math.random() * range) + limiteInferiore; //Si tratta di una classe ed un metodo statico
            System.out.print(numero + " ");
            if (mioNumero == numero) {
                System.out.println("\n" + "Trovata corrispondenza dopo " + (ciclo+1) + " tentativi");
                break;
            }
            ciclo++;
        }
        System.out.println("Fine programma con il ciclo WHILE");
        System.out.println("\n");
        System.out.println("Inizio programma con il ciclo DO-WHILE");
        ciclo = 0; //Azzero la variabile "ciclo"
        System.out.print("Numero generato casualmente: ");
        do {
            int numero = (int) (Math.random() * range) + limiteInferiore;
            System.out.print(numero + " ");
            if (mioNumero == numero) {
                System.out.println("\n" + "Trovata corrispondenza dopo " + (ciclo+1) + " tentativi");
                break;
            }
            ciclo++;
        }
        while (ciclo < 10) ;
        System.out.println("Fine programma con il ciclo DO-WHILE");
    }
}