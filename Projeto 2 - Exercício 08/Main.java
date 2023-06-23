import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner produto = new Scanner(System.in);
    
    System.out.println("Informe o preço do primeiro produto: ");
    float n1 = produto.nextFloat();
    System.out.println("Informe o preço do segundo produto: ");
    float n2 = produto.nextFloat();
    System.out.println("Informe o preço do terceiro produto: ");
    float n3 = produto.nextFloat();

    if(n1 < n2 && n1 < n3)
      System.out.println("O produto que você deve comprar é: " + n1);
    else if(n2 < n1 && n2 < n3)
      System.out.println("O produto que você deve comprar é: " + n2);
    else if(n3 < n1 && n3 < n2)
      System.out.println("O produto que você deve comprar é: " +n3);
    else{
      System.out.println("O caractere informado não é um número! ");
    }
  }
}