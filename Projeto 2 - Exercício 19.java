import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado =  new Scanner(System.in);
    
    System.out.println("Informe um número menor que mil para informar as casas decimais: ");
    int numero = teclado.nextInt();

    int centena = numero /100;
    int dezena = (numero % 100) / 10;
    int unidade = numero % 10;

    if(numero >= 100 &&  numero < 1000) {
      System.out.println("Centena: " + centena + " Dezena: " + dezena + " Unidade: " + unidade);
    } else if(numero > 9 && numero < 100) {
      System.out.println(" Dezena: " + dezena + " Unidade: " + unidade);
    } else if(numero > 0 && numero < 10) {
      System.out.println(" Unidade: " + unidade);
    } else {
      System.out.println("Só pode ser número maior que zero e menor que mil! ");
    }
  }
}