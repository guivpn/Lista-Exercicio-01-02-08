import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
    
    System.out.println("Digite o primeiro número: ");
    float n1 = numero.nextFloat();
    System.out.println("Digite o segundo número: ");
    float n2 = numero.nextFloat();
    System.out.println("Digite o terceiro número: ");
    float n3 = numero.nextFloat();

    if(n1 > n2 && n1 > n3)
      System.out.println("O número maior é: " + n1);
    else if(n2 > n1 && n2 > n3)
      System.out.println("O número maior é: " + n2);
    else if(n3 > n1 && n3 > n2)
      System.out.println("O numero maior é: " +n3);
      
    if(n1 < n2 && n1 < n3)
      System.out.println("O número menor é: " +n1);
    else if(n2 < n1 && n2 < n3)
      System.out.println("O número menos é: " + n2);
    else if(n3 < n1 && n3 < n2)
      System.out.println("O número menor é: " +n3);
    else if(n1 == n2 && n1 == n3 || n2 == n1 && n2 == n3 || n3 == n1 && n3 == n2)
      System.out.println("Os caracteres infomado são identicos! Sendo assim, não há maior. ");

    else{
      System.out.println("Os caracteres informado não é número! ");
    }
  }
}
