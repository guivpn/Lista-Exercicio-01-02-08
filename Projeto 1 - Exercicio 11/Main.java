import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner calculo = new Scanner(System.in);
    
    System.out.println("Digite um número inteiro: ");
    int n1 = calculo. nextInt();
    System.out.println("Digite o segundo número inteiro: ");
    int n2 = calculo. nextInt();
    System.out.println("Digite um número real: ");
    double n3 = calculo. nextDouble();

    double resul1 = (n1 + n1) * (n2 / 2);
    System.out.println("O produto do dobro do primeiro com metade do segundo é: " +             resul1);
    
    double resul2 = (n1 * 3) + n3;
    System.out.println("a soma do triplo do primeiro com o terceiro: " + resul2);
    
    double base = n3;
    double expoente = 3;
    double resul3 = Math.pow(base,expoente);
    System.out.println("o terceiro elevado ao cubo: " + resul3);

    //exemplo de como seria a potencia.
    //double resul3 = n3 * n3 * n3;
    //System.out.println("o terceiro elevado ao cubo: " +       
    //resul3);
  }
}