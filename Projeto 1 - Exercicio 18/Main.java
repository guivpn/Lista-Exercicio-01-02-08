import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner mega = new Scanner(System.in);

    System.out.println("Informe-nos o tamanho de um arquivo para download em MB: ");
    double mb = mega.nextDouble();
    System.out.println("Informe a velocidade de um link de internet em Mbps: ");
    double mbps = mega.nextDouble();

    double valor = mb / mbps;

    double resul = valor / 60;
    System.out.println("Valor: " + resul);
  }
}