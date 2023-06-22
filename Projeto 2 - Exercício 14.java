import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Entrada
    System.out.println("Informe uma nota: ");
    float nota1 = teclado.nextFloat();
    System.out.println("Informe outra nota: ");
    float nota2 = teclado.nextFloat();
    float media = (nota1 + nota2) / 2;

    //Resultado
    String A = "Aprovado! ";
    String B = "Reprovado! ";

    //Lógica
    if(media > 9 && media <= 10){
      System.out.println("Primeira nota digitada: " + nota1);
      System.out.println("Segunda nota digitada: " + nota2);
      System.out.println("Média das notas: " + media);
      System.out.println(A);
    } else if(media <= 9 && media > 7.5){
        System.out.println("Primeira nota digitada: " + nota1);
        System.out.println("Segunda nota digitada: " + nota2);
        System.out.println("Média das notas: " + media);
        System.out.println(A);
    } else if(media <= 7.5 && media > 6){
        System.out.println("Primeira nota digitada: " + nota1);
        System.out.println("Segunda nota digitada: " + nota2);
        System.out.println("Média das notas: " + media);
        System.out.println(A);
    } else if(media <= 6 && media > 4){
        System.out.println("Primeira nota digitada: " + nota1);
        System.out.println("Segunda nota digitada: " + nota2);
        System.out.println("Média das notas: " + media);
        System.out.println(B);
    } else if(media <= 4 && media > 0){
        System.out.println("Primeira nota digitada: " + nota1);
        System.out.println("Segunda nota digitada: " + nota2);
        System.out.println("Média das notas: " + media);
        System.out.println(B);
    } else{
      System.out.println("Nota excedeu o máximo da média que é 10! ");
    }
  }
}