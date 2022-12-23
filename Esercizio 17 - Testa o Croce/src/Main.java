/*
Scriviamo un applicazione che visualizzi su un numero di 20 lanci
T se esce testa e C se esce croce:
Contare quante volte è uscita testa e quante volte croce.
[volendo si può implementare il programma inserendo le T e le C
in un array di 20 elementi che contiene i singoli caratteri (T e C) ]
*/

public class Main {
    public static void main(String[] args) {
        int contatoreTesta = 0;
        int contatoreCroce = 0;
        char [] lanci = new char[20];
        char testa = 84;
        char croce = 67;
        for (int i = 0; i < 20; i++){
            int estrazione = (int) (Math.random() * 2);
            if (estrazione==1){
                lanci[i] = 84;
                contatoreTesta++;
            }
            else{
                lanci[i] = 67;
                contatoreCroce++;
            }
        }
        for (int i = 0; i < 20; i++){
            System.out.println(lanci[i] + "\t");
        }
        System.out.println();
        System.out.println("Testa è uscita " + contatoreTesta + " volte");
        System.out.println("Croce è uscita " + contatoreCroce + " volte");
    }
}