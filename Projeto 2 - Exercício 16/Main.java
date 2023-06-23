import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner equacao = new Scanner(System.in);
    System.out.println("Cálculo equação segundo grau. ");
    System.out.println("");

    System.out.println("Informe o valor de A: ");
    float A = equacao.nextFloat();

    float B = 0;
    float C = 0;
    
    int x = 1;
    while(x == 1) {
      if(A == 0) {
      System.out.println("O valor de A não pode ser zero, ou seja, não é uma equação do segundo grau. ");
      break;
      
    } else {
      System.out.println("Informe o valor de B: ");
      B = equacao.nextFloat();

      System.out.println("Informe o valor de C: ");
      C =  equacao.nextFloat();
      break;
      }
    }
    //Parar de escanear
    equacao.close();
    
    float delta = (float) Math.pow(B,2) - 4 * A * C;

    if(delta == 0) {
      System.out.println("A equação possui apenas uma raiz real! ");
    } else if(delta < 0) {
      System.out.println("A equação não possui raizes reais! ");

    } else {
      System.out.println("A equação possui duas raiz reais! ");
    }
  }
}