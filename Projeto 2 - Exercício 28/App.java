import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nHipermercado Tabajara.\n");

        System.out.println("Informe qual tipo de carne você irá comprar: 'File Duplo', 'Alcatra' ou 'Picanha'");
        System.out.println("Lembrando que só pode ser um tipo!");
        String tipoCarne = teclado.nextLine().toUpperCase();
        System.out.println();

        System.out.println("Informe a quantidade de carne em Kg que você irá adquirir:");
        double quantidadeCarne = teclado.nextDouble();
        System.out.println();

        System.out.println("Informe o meio de pagamento digitando D - dinheiro à vista ou C - Cartão Tabajara");
        System.out.println("Compras no cartão Tabajara têm cinco por cento de desconto no valor total para pagamento!");
        String meioPagamento = teclado.next().toUpperCase();

        // Desligamento do Scanner
        teclado.close();

        double precoTotal;
        double descontoCartao = 0;

        if (tipoCarne.equals("FILE DUPLO")) {
            double precoFileAteCinco = 4.90;
            double precoFileAcimaCinco = 5.80;

            if (quantidadeCarne <= 5) {
                precoTotal = quantidadeCarne * precoFileAteCinco;
                if (meioPagamento.equals("C")) {
                    descontoCartao = (precoTotal * 5) / 100;
                }
            } else {
                precoTotal = quantidadeCarne * precoFileAcimaCinco;
                if (meioPagamento.equals("C")) {
                    descontoCartao = (precoTotal * 5) / 100;
                }
            }
        } else if (tipoCarne.equals("ALCATRA")) {
            double precoAlcatraAteCinco = 5.90;
            double precoAlcatraAcimaCinco = 6.80;

            if (quantidadeCarne <= 5) {
                precoTotal = quantidadeCarne * precoAlcatraAteCinco;
                if (meioPagamento.equals("C")) {
                    descontoCartao = (precoTotal * 5) / 100;
                }
            } else {
                precoTotal = quantidadeCarne * precoAlcatraAcimaCinco;
                if (meioPagamento.equals("C")) {
                    descontoCartao = (precoTotal * 5) / 100;
                }
            }
        } else if (tipoCarne.equals("PICANHA")) {
            double precoPicanhaAteCinco = 6.90;
            double precoPicanhaAcimaCinco = 7.80;

            if (quantidadeCarne <= 5) {
                precoTotal = quantidadeCarne * precoPicanhaAteCinco;
                if (meioPagamento.equals("C")) {
                    descontoCartao = (precoTotal * 5) / 100;
                }
            } else {
                precoTotal = quantidadeCarne * precoPicanhaAcimaCinco;
                if (meioPagamento.equals("C")) {
                    descontoCartao = (precoTotal * 5) / 100;
                }
            }
        } else {
            System.out.println("Tipo de carne inválido!");
            return;
        }

        System.out.println("Tipo de Carne: " + tipoCarne);
        System.out.println("Quantidade de carne: " + quantidadeCarne + " Kg");
        System.out.println("Preço total: R$" + precoTotal);

        if (meioPagamento.equals("C")) {
            System.out.println("Meio de pagamento: Cartão Tabajara");
            System.out.println("Desconto do cartão Tabajara: R$" + descontoCartao);
            double valorFinal = precoTotal - descontoCartao;
            System.out.println("Valor a pagar: R$" + valorFinal);
        } else if (meioPagamento.equals("D")) {
            System.out.println("Meio de pagamento: Dinheiro à vista");
            System.out.println("Valor a pagar: R$" + precoTotal);
        } else {
            System.out.println("Meio de pagamento inválido!");
        }
    }
}
