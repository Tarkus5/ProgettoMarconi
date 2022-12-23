public class Main {
    public static void main(String[] args) {
        int altezza = 10;
        int altezzaDue = 1;
        int contatoreRiga = 1;
        int contatoreAsterischi = 1;
        //Disegno la prima metà da 1 a 7
        for (contatoreRiga = 1; contatoreRiga <= altezza; contatoreRiga++) {
            for (contatoreAsterischi = 1; contatoreAsterischi <= contatoreRiga; contatoreAsterischi++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Disegno i tre ascherischi come base
        for (contatoreRiga = 1; contatoreRiga <= 1; contatoreRiga++) {
            for (contatoreAsterischi = 1; contatoreAsterischi <= contatoreRiga; contatoreAsterischi++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (contatoreRiga = 1; contatoreRiga <= 1; contatoreRiga++) {
            for (contatoreAsterischi = 1; contatoreAsterischi <= contatoreRiga; contatoreAsterischi++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (contatoreRiga = 1; contatoreRiga <= 1; contatoreRiga++) {
            for (contatoreAsterischi = 1; contatoreAsterischi <= contatoreRiga; contatoreAsterischi++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}