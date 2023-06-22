import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe quanto você recebe em dinheiro por horas trabalhadas: ");
    float horas = teclado.nextFloat();

    System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
    float mes = teclado.nextFloat();

    //Salário bruto
    float resul = horas *  mes;
    
    //Calculos
    float ir = (resul * 5) / 100;
    float inss = (resul * 10) / 100;
    float fgts = (resul * 11) / 100;

    
    float resul1 = ir;
    float resul2 = inss;
    float resul3 = fgts;

    //Desconto total
    float total_desconto = ir + inss + fgts;
    
    //Salário liquido
    float total_liquido = resul - total_desconto;

    //Salário bruto
    float total = resul;
    
    //Lógica
    System.out.println("Salário bruto: " + resul);
    
    if(resul <= 900)
      System.out.println("Salário abaixo de R$ 900,00 são isento de impostos");
    else if(resul > 900 && resul <= 1500){
      System.out.println("Imposto de renda: " + resul1);
      System.out.println("INSS: " + resul2);
      System.out.println("FGTS: " + resul3);
      System.out.println("Total de descontos: " + total_desconto);
      System.out.println("Salário liquido: " + total_liquido);
      
    } else if(resul > 1500 && resul <= 2500){
      System .out.println("Imposto de renda: " + resul1);
      System.out.println("INSS: " + resul2);
      System.out.println("FGTS: " + resul3);
      System.out.println("Total de descontos: " + total_desconto);
      System.out.println("Salário liquido: " + total_liquido);
      
    } else if(resul > 2500){
      System.out.println("Imposto de renda: " + resul1);
      System.out.println("INSS: " + resul2);
      System.out.println("FGTS: " + resul3);
      System.out.println("Total de descontos: " + total_desconto);
      System.out.println("Salário liquido: " + total_liquido);
    
    } else{
      System.out.println("Valor inválido! ");
    }
  }
}