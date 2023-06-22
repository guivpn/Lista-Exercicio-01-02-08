import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
    
    System.out.println("\nInforme o primeiro lado do triângulo: ");
    float n1 = teclado.nextFloat();
    System.out.println("\nInforme o segundo lado do triângulo: ");
    float n2 = teclado.nextFloat();
    System.out.println("\nInforme o terceiro lado do triângulo: ");
    float n3 = teclado.nextFloat();

    //Primeiro
    if(n1 == n2 && n2 == n3 && n1 == n3) {
      System.out.println("\nOs valores fornecidos são um triângulo! ");
      System.out.println("\nEsse triângulo é equilátero! ");
      System.out.println("");
    //Segundo
    } else if(n1 == n2 && n1!= n3 && n2 != n3) {
      System.out.println("\nOs valores fornecidos são um triângulo! ");
      System.out.println("\nEsse triângulo é isósceles! ");
      System.out.println("");
      
    } else if(n2 == n3 && n2 != n1 && n3 != n1) {
      System.out.println("\nOs valores fornecidos são um triângulo! ");
      System.out.println("\nEsse triângulo é isósceles! ");
        
    } else if(n1 == n3 &&  n1 != n2 && n3 != n2) {
      System.out.println("\nOs valores fornecidos são um triângulo! ");
      System.out.println("\nEsse triângulo é isósceles! ");
      //Terceiro
    } else if(n1 != n2 && n1 != n3 && n2 != n1 && n2 != n3 && n3 != n1 && n3 != n2) {
      System.out.println("\nOs valores fornecidos são um triângulo! ");
      System.out.println("\nEsse triângulo é escaleno");
      System.out.println("");
      
    } 
  }
}
