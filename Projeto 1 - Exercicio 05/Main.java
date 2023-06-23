import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner valor = new Scanner(System.in);
    
    System.out.println("Digite a metragem: ");
    double n1 = valor.nextDouble();

    double mult = n1 * 100;
    System.out.println("A metragem em centimetro é: " + mult);
    
  }
}