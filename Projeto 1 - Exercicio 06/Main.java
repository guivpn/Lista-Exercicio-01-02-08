import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner valor = new Scanner(System.in);
    
    System.out.println("Digite o número do raio: ");
    double pi = 3.1415;
    double raio = valor.nextDouble();
    double base = raio;
    double expoente = 2;
    Double resultado = Math.pow(base, expoente);
    double resultado2 = resultado * pi;
    System.out.println("A área é: " + resultado2);
  }
}

