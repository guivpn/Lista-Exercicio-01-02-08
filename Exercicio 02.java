import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe um número: ");
    Double numero = teclado.nextDouble();
    System.out.println("O número informado é:" + numero);
  }
}