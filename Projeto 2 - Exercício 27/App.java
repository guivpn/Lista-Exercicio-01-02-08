import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Sistema de fruteira.");
        System.out.println("");
        System.out.println("Informe a quantidade em Kg de morangos comprados: ");
        double kiloMorango = teclado.nextDouble();

        System.out.println("informe a quantidade em Kg de maçã compradas: ");
        double kiloMaca = teclado.nextDouble();

        //Fechamento de Scaner
        teclado.close();

        //Informações morango
        double precoMorangoAbaixoDeCinco = 2.5;
        double precoMorangoUm = precoMorangoAbaixoDeCinco * kiloMorango;
        //Segunda etapa morando
        double precoMorangoAcimaDeCinco = 2.20;
        double precoMorangoDois = precoMorangoAcimaDeCinco * kiloMorango;

        //Informações maça
        double precoMacaAbaixoDeCinco = 1.80;
        double precoMacaUm = precoMacaAbaixoDeCinco * kiloMaca;
        //Segunda etapa maça
        double precoMacaAcimaDeCinco = 1.50;
        double precoMacaDois = precoMacaAcimaDeCinco * kiloMaca;

        //Valor morango e maçã abaixo de cinco kilos
        double valorDosDoisAbaixoDeCinco = precoMorangoUm + precoMacaUm;

        //Valor morango e maçã acima de cinco kilos
        double valorDosDoisAcimaDeCinco = precoMorangoDois + precoMacaDois;


        //Somatório das duas informações das frutas em Kg
        double somatorio = kiloMorango + kiloMaca;


        //Desconto acima de 8Kg ou acima de 25 reais
        double descontoAcimaDeOitoKgOuValorAcimaDeVinteECinco = 0;

        //Valor com Desconto
        double resultFinalComDesconto = 0;
        if(somatorio <= 5) {
            System.out.println("O valor a ser pago será: " + valorDosDoisAbaixoDeCinco);
        } else if(somatorio > 5 && somatorio <= 8) {
            System.out.println("O Valor a ser pago será: " + valorDosDoisAcimaDeCinco);
        } else if(somatorio > 8 || valorDosDoisAcimaDeCinco > 25) {
            descontoAcimaDeOitoKgOuValorAcimaDeVinteECinco = (valorDosDoisAcimaDeCinco * 10) / 100;
            resultFinalComDesconto = valorDosDoisAcimaDeCinco - descontoAcimaDeOitoKgOuValorAcimaDeVinteECinco;
            System.out.println("");
            System.out.println("O valor com desconto a ser pago será: " + resultFinalComDesconto);
            System.out.println("");
            System.out.println("O desconto que você conseguiu foi de: " + descontoAcimaDeOitoKgOuValorAcimaDeVinteECinco);
        } else {
            System.out.println("O valor não pode ser menor que 0. ");
        }
    }
}
