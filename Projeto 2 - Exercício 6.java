import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner valor = new Scanner(System.in);
    
    System.out.println("Digite o primeiro Número: ");
    float n1 = valor.nextFloat();
    System.out.println("Digite o segundo Número: ");
    float n2 = valor.nextFloat();
    System.out.println("Digite o terceito Número: ");
    float n3 = valor.nextFloat();

    if(n1 > n2 && n1 > n3)
      System.out.println("O maior número é: " + n1);
    else if(n2 > n1 && n2 > n3)
      System.out.println("O maior número é: " + n2);
    else if(n3 > n1 && n3 > n2)
      System.out.println("O maior número é: " + n3);
    else if(n1 == n2 && n1 == n3 || n2 == n1 && n2 == n3 || n3 == n1 && n3 == n2)
      System.out.println("Os números digitados são iguais! Sendo assim, não há maior! ");
    else{
      System.out.println("Os caracteres digitado não é um número! ");
    }
  }
}