import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("");
        System.out.println("Identificador de suspeito do crime.");
        System.out.println("");
        System.out.println("Informe sim ou não para resposta!");
        System.out.println("");

        System.out.println("Telefonou para a vitima? Informe 'Sim' ou 'Não'! ");
        String ligacaoVitima = teclado.next().toUpperCase();

        System.out.println("Esteve no local do crime? Informe 'Sim' ou 'Não'! ");
        String localCrime = teclado.next().toUpperCase();

        System.out.println("Mora perto da vítima? Informe 'Sim' ou ''Não'! ");
        String casaVitima = teclado.next().toUpperCase();

        System.out.println("Devia para a vítima? Informe 'Sim' ou 'Não'! ");
        String dividaVitima = teclado.next().toUpperCase();

        System.out.println("Já trabalhou com a vítima? Informe 'Sim' ou 'Não'! ");
        String trabalhouVitima = teclado.next().toUpperCase();

        teclado.close();

        int porcentagemEnvolvido = 0;
        int quantidadePositiva = 0;

        if(ligacaoVitima.equals("SIM")) {
            porcentagemEnvolvido += 20;
            quantidadePositiva ++;

        } if(localCrime.equals("SIM")) {
            porcentagemEnvolvido += 20;
            quantidadePositiva ++;

        } if(casaVitima.equals("SIM")) {
            porcentagemEnvolvido += 20;
            quantidadePositiva ++;

        } if(dividaVitima.equals("SIM")) {
            porcentagemEnvolvido += 20;
            quantidadePositiva ++;

        } if(trabalhouVitima.equals("SIM")) {
            porcentagemEnvolvido += 20;
            quantidadePositiva ++;
        }

        if(quantidadePositiva == 2) {
            System.out.println("");
            System.out.println("Você é suspeito(a)! ");
            System.out.println("\nPorcentagem de chance: " + porcentagemEnvolvido + "%.");
        } else if(quantidadePositiva >= 3 && quantidadePositiva <= 4) {
            System.out.println(""); 
            System.out.println("Você é cúmplice! ");
            System.out.println("Porcentagem de chance: " + porcentagemEnvolvido + "%.");
        } else if(quantidadePositiva == 5) {
            System.out.println("");
            System.out.println("Você é o assassino(a)! ");
            System.out.println("Porcentagem de chance: " + porcentagemEnvolvido + "%.");
        } else {
            System.out.println("");
            System.out.println("Você é inocente! ");
            System.out.println("Porcentagem de chance: " + porcentagemEnvolvido + "%.");
        }
    }
}
