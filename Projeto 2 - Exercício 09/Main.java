import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
   
    System.out.println("Informe o primeiro número: ");
    float n1 = numero.nextFloat();
    System.out.println("Informe o segundo número: ");
    float n2 = numero.nextFloat();
    System.out.println("Informe o terceiro número: ");
    float n3 = numero.nextFloat();

    if(n1 > n2 && n1 > n3) {
      System.out.println(n1);
      if(n2 > n3) {
        System.out.println(n2);
        System.out.println(n3);
      } else {
        System.out.println(n3);
        System.out.println(n2);
      }
    } else if(n2 > n1 && n2 > n3) {
      System.out.println(n2);
      if(n1 > n3) {
        System.out.println(n1);
        System.out.println(n3);
      } else {
        System.out.println(n3);
        System.out.println(n1);
      }
    } else if(n3 > n1 && n3 > n2) {
      System.out.println(n3);
      if(n1 > n2) {
        System.out.println(n1);
        System.out.println(n2);
      } else {
        System.out.println(n2);
        System.out.println(n1);
      }
    }
  }
}