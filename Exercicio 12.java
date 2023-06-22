import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner altura = new Scanner(System.in);

    System.out.println("Informe sua altura: ");
    double peso = altura.nextDouble();

    double peso_ideal = (peso * 72.7) - 58;
    System.out.println("Seu peso ideal é: " + peso_ideal);
  
  }
}