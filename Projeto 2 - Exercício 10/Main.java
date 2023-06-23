import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe o turno que deseja estudar. Digite M-matutino, V-vespertino e N-noturno: ");
    String letra = teclado.next().toUpperCase();
    if(letra.equals ("M"))
      System.out.println("Bom dia! ");
    else if(letra.equals ("V"))
      System.out.println("Boa tarde! ");
    else if(letra.equals ("N"))
      System.out.println("Boa noite! ");
    
    else{
      System.out.println("Valor invalido! ");
    }
  }
}