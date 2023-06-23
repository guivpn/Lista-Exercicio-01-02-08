import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner peixes = new Scanner(System.in);

    System.out.println("Digite os kilos de peixes: ");
    double peso = peixes.nextDouble();

    double multa = 4;
    double excesso = peso - 50;
    
    if(peso > 50){
      double resultado = excesso * multa;
      System.out.println("A multa por excesso é: " + resultado);
    } 
    else{
      System.out.println("Limite adequado! ");
    }
  }
}