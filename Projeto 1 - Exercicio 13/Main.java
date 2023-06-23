import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sexo =  new Scanner(System.in);
    Scanner sexo2 = new Scanner(System.in);

    System.out.println("CÁLCULO PESO IDEAL. ");
    System.out.println("Se você é homem digite 1 e se mulher 2: ");
    int sexo1 = sexo.nextInt();
    System.out.println("ÓTIMO! ");
    
    System.out.println("Informe sua altura: ");
    double alt = sexo2.nextDouble();

    if (sexo1 == 1) {
      double homem_resul = (alt * 72.7) - 58;
      System.out.println("Seu peso ideal é: " + homem_resul);
      
}   else if(sexo1 == 2){
      double mulher_resul = (alt * 62.1) - 44.7;
      System.out.println("Seu peso ideal  é: " + mulher_resul);
      
} else {
      System.out.println("Você não digitou os caracteres requerido! ");
}
  }
}

