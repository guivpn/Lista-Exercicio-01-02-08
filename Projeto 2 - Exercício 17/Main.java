import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Sistem de calcular se o ano é bissexto ou não. ");
    System.out.println("");
    
    System.out.println("Informe algum ano: ");
    int ano = teclado.nextInt();

    if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
      System.out.println("O ano é bissexto! ");
    } else{
      System.out.println("O ano não é bissexto! ");
    }
  }
}