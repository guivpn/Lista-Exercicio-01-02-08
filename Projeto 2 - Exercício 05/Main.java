import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner nota = new Scanner(System.in);
    
    System.out.println("Digite um nota: ");
    float n1 = nota.nextFloat();
    System.out.println("Digite outra nota: ");
    float n2 = nota.nextFloat();

    float resul = (n1 + n2) / 2;

    if(resul >= 7 && resul <=9)
      System.out.println("Aprovado! ");

    else if(resul < 7)
      System.out.println("Reprovado! ");

    else if(resul == 10)
      System.out.println("Aprovado com distinção! ");

    else{
      System.out.println("Nota excedeu a média de 10! ");
    }
  }
}