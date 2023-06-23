import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner letra = new Scanner(System.in);
    
    System.out.println("Digite uma letra: ");
    String l1 = letra.next();

    if(l1.equals("M") || l1.equals("m"))
      System.out.println("Masculino! ");
    else if(l1.equals("F") || l1.equals("f"))
      System.out.println("Feminino! ");
    else{
      System.out.println("Letra não é igual a M ou F! ");
    }
  }
}