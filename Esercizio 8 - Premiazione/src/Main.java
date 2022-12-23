/*
i hanno a disposizione tre premi identici da assegnare in un gruppo di dieci finalisti, ai quali sono stati associati i numeri da 1 a 10.
Scrivere un programma che scelga in modo casuale i numeri dei tre finalisti che riceveranno un premio.
Si faccia attenzione a non sorteggiare lo stesso numero più volte.
Per esempio, l’estrazione dei finalisti 3, 6, 2 sarebbe valida ma quella di 3, 3, 11 no
perché il finalista numero 3 compare due volte e inoltre 11 non è un numero valido per un finalista.
*/
/* MIO TENTATIVO
int finalistaEstratto = 0;
        int limiteSuperiore = 10;
        int limiteInferiore = 1;
        int range = (limiteSuperiore - limiteInferiore) + 1;
        System.out.print("Estratti i finalisti numero: ");

        while (finalistaEstratto < 3){
            int numero = (int) (Math.random() * range) + limiteInferiore;
            System.out.print(numero + " ");
            finalistaEstratto++;
        } */
public class Main {
    public static void main(String[] args) {
        int finalistaEstratto1, finalistaEstratto2, finalistaEstratto3;
        do {
            finalistaEstratto1 = (int) (Math.random()*10) +1;
            finalistaEstratto2 = (int) (Math.random()*10) +1;
            finalistaEstratto3 = (int) (Math.random()*10) +1;
        }
        while ((finalistaEstratto1 == finalistaEstratto2) || (finalistaEstratto1 == finalistaEstratto3) || (finalistaEstratto2 == finalistaEstratto3));
        System.out.println("I vincitori sono " + finalistaEstratto1 + ", " + finalistaEstratto2 + ", " + finalistaEstratto3);

    }
}