import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner valor = new Scanner(System.in);

    System.out.println("Digite a área base do quadrado: ");
    double base = valor.nextDouble();

    System.out.println("Digite a altura do quadrado: ");
    double altura = valor.nextDouble();

    double dobro = base * altura * 2;
    System.out.println("O valor do área em dobro é: " + dobro);
  }
}