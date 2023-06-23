import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Systema de par e ímpar.");
        System.out.println("");

        System.out.println("Informe um número inteiro: ");
        int numero = teclado.nextInt();

            if(numero % 2 == 0) {
                System.out.println("O número é par! ");
            } else {
                System.out.println("O número é ímpar! ");
            }

    }
}
