import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe o salário para descobrirmos o novo sálario ajustado: ");
    float salario = teclado.nextFloat();

    float sal1 = (salario * 20) / 100;
    float sal2 = (salario * 15) / 100;
    float sal3 = (salario * 10) / 100;
    float sal4 = (salario * 5) / 100;

    float resul1 = sal1 + salario;
    float resul2 = sal2 + salario;
    float resul3 = sal3 + salario;
    float resul4 = sal4 + salario; 
    
    if(salario <= 280){
      System.out.println("Salário antigo: " + salario);
      System.out.println("Percentual de aumento: 20%.");
      System.out.println("Valor do aumento: " + sal1);
      System.out.println("Salário ajustado: " + resul1);
    
    
    } else if(salario > 280 && salario <= 700){
      System.out.println("Salário antigo: " + salario);
      System.out.println("Percentual de aumento: 15%.");
      System.out.println("Valor do aumento: " + sal2);
      System.out.println("Salário ajustado: " + resul2);

    } else if(salario > 700 && salario <= 1500){
      System.out.println("Salário antigo: " + salario);
      System.out.println("Percentual de aumento: 10%.");
      System.out.println("Valor do aumento: " + sal3);
      System.out.println("Salário ajustado: " + resul3);

    } else if(salario > 1500){
      System.out.println("Salário antigo: " + salario);
      System.out.println("Percentual de aumento: 5%.");
      System.out.println("Valor do aumento: " + sal4);
      System.out.println("Salário ajustado: " + resul4);
    
    } else{
      System.out.println("Valor invalido! ");
    }
  }
}