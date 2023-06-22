import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
    
    System.out.println("DIgite um número: ");
    float n1 = numero.nextFloat();

    if(n1 > 0)
      System.out.println("Positivo! ");
    else if(n1 < 0){
      System.out.println("Negativo! ");
    }
    else {
      System.out.println("Número neutro! ");
    }
  }
}