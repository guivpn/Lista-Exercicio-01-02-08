import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner grau = new Scanner(System.in);
    
    System.out.println("Informe a temperatura em graus Fahrenheit: ");
    double fah = grau.nextDouble();

    double trans = 5 * (fah-32) / 9;
    System.out.println("A temperatura em Celsius é: " + trans);
    
  }
}