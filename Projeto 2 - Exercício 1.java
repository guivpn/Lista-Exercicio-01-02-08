import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    float n1 = numero.nextFloat();
    System.out.println("Digite outro número: ");
    float n2 = numero.nextFloat();

    if(n1 > n2)
      System.out.println("Este numero " + n1 + " é maior que " + n2);
    else{
      System.out.println("Este numero " + n2 + " é maior que " + n1);
    } 
  }
}