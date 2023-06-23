import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = teclado.nextDouble();

        //double input = double.parseDouble(numero);

        //Fechamento de Scanner
        teclado.close();

        if(numero % 1 == 0) {
            System.out.println("O número digitado é inteiro! ");
        } else {
            System.out.println("O número digitado é decimal! ");
        }

    }
}
