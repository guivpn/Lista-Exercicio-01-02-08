import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner valor = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    double n1 = valor.nextDouble();
    System.out.println("Digite a primeira nota: ");
    double n2 = valor.nextDouble();
    System.out.println("Digite a primeira nota: ");
    double n3 = valor.nextDouble();
    System.out.println("Digite a primeira nota: ");
    double n4 = valor.nextDouble();

    double valor1 = (n1 + n2 + n3 + n4) / 4;
    System.out.println("A média das notas é: " + valor1);
    
  }
}