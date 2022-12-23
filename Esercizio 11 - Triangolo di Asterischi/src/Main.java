public class Main {
    public static void main(String[] args) {
        System.out.println("Disegnare un triangolo di asterischi");
        /*
        Usiamo dei cicli annidati: il ciclo esterno controlla la riga.
        Il ciclo interno controlla il numero di asterischi da stampare.
        Le varibiali che ci servono sono: un contatore di riga ed uno di
        asterischi.
        */
        int contatoreRiga = 1;
        int contatoreAsterischi = 1;
        int dimensione = (int) (Math.random()*51); //h massima del triangolo
        //Disegno la prima metà
        for (contatoreRiga = 1; contatoreRiga <= dimensione; contatoreRiga++){
            //Fino a quando la variabile che conta gli asterischi è inferiore al valore
            //della variabile he conta l'altezza massima del triangolo stampo un asterisco
            for (contatoreAsterischi = 1; contatoreAsterischi <= contatoreRiga; contatoreAsterischi++){
                System.out.print("*");
            }
            System.out.println(); //Ritorno a capo per dare la forma a triangolo
        }
        //Disegno la seconda metà riducendo il valore della variabile asterischi
        for (contatoreRiga = dimensione - 1; contatoreRiga > 0; contatoreRiga--){
            for (contatoreAsterischi = 1; contatoreAsterischi <= contatoreRiga; contatoreAsterischi++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}