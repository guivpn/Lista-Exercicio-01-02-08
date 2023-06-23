import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor maior que 10 e menor que 600: ");
        int valorSaque = teclado.nextInt();

        //Fechamento de Scanner
        teclado.close();

        if(valorSaque < 10 || valorSaque > 600) {
            System.out.println("O valor informado tem que ser maior que 10 e menor que 600! ");
            return;
        }

        int notas[] = {100, 50, 10, 5, 1};

        int armazemNotas[] = new int [notas.length];

        for(int i = 0; i < notas.length; i ++) {
            armazemNotas[i] = valorSaque / notas[i];
            valorSaque %= notas[i];
        }

        for(int i = 0; i < notas.length; i ++) {
            if(armazemNotas[i] != 0) {
                System.out.println(armazemNotas[i] + " Nota(s): " + notas[i] + " reais");
            }
        }
    }
}