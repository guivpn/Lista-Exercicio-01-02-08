import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Bichinho bichinho = new Bichinho("Fido");

        Scanner teclado = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("3 - Sair");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    bichinho.comer();
                    break;
                case 2:
                    bichinho.brincar();
                    break;
                case 42: // Opção secreta
                    System.out.println(bichinho.str());
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        teclado.close();
    }
}