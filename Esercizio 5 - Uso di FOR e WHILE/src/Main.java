public class Main {
    public static void main(String[] args) {
        System.out.println("Stampa dei numeri pari tra 0 e 20");

        for (int numero = 0; numero <= 20; numero++){
            //Se il numero è /2 allora è pari
            if (numero%2 == 0){
                System.out.println("Il numero " + numero + " è pari");
            }
        }
        System.out.println("Fine programma con il FOR");

        System.out.println("Inizio programma con il while");
        int numero = 0;
        while ( numero <= 20){
            if (numero%2 != 0){
                System.out.println("Il numero " + numero + " è dispari");
            }
            numero++;
        }
        System.out.println("Fine del programma con il WHILE");

        System.out.println("Inizio programma con il costrutto DO-WHILE");
        //Valutiamo se i numeri da 10 a 20 sono pari
       int primoNumero = 0;
       //Il DO ci fa una prima lettura anche se il ciclo WHILE risulta essere falso
       do {
           if (primoNumero % 2 != 0)
               System.out.println("Il numero " + primoNumero + " è dispari");
               primoNumero++;
       }
       while (primoNumero<=20);

    }

}