import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nSistema de cálculo da média das notas.");
        System.out.println("\nInforme a primeira nota: ");
        float notaUm =  teclado.nextFloat();
        System.out.println("\ninforme a segunda nota: ");
        float notaDois = teclado.nextFloat();
        System.out.println("\nInforme a terceita nota: ");
        float notaTres = teclado.nextFloat();

        teclado.close();

        float  media = (notaUm + notaDois + notaTres) / 3;

        if(media >= 7) {
            System.out.println("Aprovado! " + "A média foi: " + media);
        } else if(media < 7) {
            System.out.println("Reprovado! ");
        } else if(media == 10) {
            System.out.println("Aprovado com distinção! ");
        } else {
            System.out.println("A média não poder ser menor que zero! ");
        }
    }
}
