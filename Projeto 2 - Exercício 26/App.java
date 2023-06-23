import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tipo de combustível, sendo A- alcool ou G- gasolina: ");
        String tipoCombustivel = teclado.next().toUpperCase();

        System.out.println("Informe a quantidade de litros comprados: ");
        double litrosComprados = teclado.nextDouble();

        //Fechamento de teclado
        teclado.close();

        //INFORMAÇÕES DO ALCOOL
        double descontoAlcool = 0;
        double precoAlcool = 1.90;
        double valorTotalAlcool = precoAlcool * litrosComprados;
        double precoCorretoAlcool = 0;

        //INFORMAÇÕES DA GASOLINA
        double descontoGasolina = 0;
        double precoGasolina = 2.5;
        double valorTotalGasolina = precoGasolina * litrosComprados;
        double precoCorretoGasolina = 0;


        if(tipoCombustivel.equals("A")) {
            if(litrosComprados <= 20) {
                descontoAlcool = (litrosComprados * 3) / 100;
                precoCorretoAlcool = valorTotalAlcool - descontoAlcool;
                System.out.println("O valor a ser pago será: " + precoCorretoAlcool);
                System.out.println("Você teve " + descontoAlcool + "reais de desconto! ");

            } else if(litrosComprados > 20) {
                descontoAlcool = (litrosComprados * 5) / 100;
                precoCorretoAlcool = valorTotalAlcool - descontoAlcool;
                System.out.println("O valor a ser pago será: " + precoCorretoAlcool);
                System.out.println("Você teve " + descontoAlcool + "reais de desconto! ");
            }


        } else if(tipoCombustivel.equals("G")) {
            if(litrosComprados <= 20) {
                descontoGasolina = (litrosComprados * 4) / 100;
                precoCorretoGasolina = valorTotalGasolina - descontoGasolina;
                System.out.println("O valor a ser pago será: " + precoCorretoGasolina);
                System.out.println("Você teve " + descontoGasolina + "reais de desconto! ");

            } else if(litrosComprados > 20) {
                descontoGasolina = (litrosComprados * 6) / 100;
                precoCorretoGasolina = valorTotalGasolina - descontoGasolina;
                System.out.println("O valor a ser pago será: " + precoCorretoGasolina);
                System.out.println("Você teve " + descontoGasolina + "reais de desconto! ");
            }

        } else {
            System.out.println("O valor informado não é as letras A ou G! ");
        }
    }
}
