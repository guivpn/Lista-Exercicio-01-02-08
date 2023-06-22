import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner letra = new Scanner(System.in);
    
    System.out.println("Digite um letra");
    String l1 = letra.next().toUpperCase();
    
    if(l1.equals("A") || l1.equals("E") || l1.equals("I") || l1.equals("O") || l1.equals("U"))
      System.out.println("Letra Vogal! ");
    else if(l1.matches("[BCDFGAJKLMNPQRSTVWXYZ]"))
      System.out.println("Letra consoante! ");
    else{
      System.out.println("O caractere digitado não é uma letra! ");
    }
  }
}