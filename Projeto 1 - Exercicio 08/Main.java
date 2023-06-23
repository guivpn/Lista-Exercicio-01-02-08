import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner salario = new Scanner(System.in);
    
    System.out.println("Digite quantos você recebe de salário por hora trabalhada: ");
    double sala1 = salario.nextDouble();

    System.out.println("Digite quantas horas você trabalha por mês: ");
    double sala2 = salario.nextDouble();

    double pormes = sala1 * sala2;
    System.out.print("Seu salário por mês é: " + pormes);
  }
}