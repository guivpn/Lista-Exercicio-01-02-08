import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner esquema = new Scanner(System.in);

    System.out.println("INFORMAÇÕES DE DESCONTO SALÁRIAL.");
    
    System.out.println("Informe quantos você recebe por hora trabalhada: ");
    double hora = esquema.nextDouble();

    System.out.println("Informe quantas horas você trabalha por mês: ");
    double mes = esquema.nextDouble();

    double salario = hora * mes;
    System.out.println("Salário bruto: " + salario);

    double ir = salario * 11 / 100;
    System.out.println("Imposto de renda: " + ir);
    
    double inss = salario * 8 / 100;
    System.out.println("INSS: " + inss);

    double sindicato = salario * 5 / 100;
    System.out.println("Sindicato: " + sindicato);

    double Salario_liquido = salario - ir - inss - sindicato;
    System.out.println("Salário liquido com descontos: " + Salario_liquido);

  }
}