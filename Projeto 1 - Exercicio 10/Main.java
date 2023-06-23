import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner grau = new Scanner(System.in);
    
    System.out.println("Informe a temperatura em graus Celsius: ");
    double trans = grau.nextDouble();

    double fah = (trans * 9/5) + 32;
    System.out.println("O grau em Fahrenheit: " + fah);
  }
}