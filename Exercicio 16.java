import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner loja = new Scanner(System.in);

    //ENTRETENIMENTO
    System.out.println("VAMOS SABER QUANTAS LATAS VOCÊ NECESSITA PARA PINTAR O LOCAL QUE DESEJA?");
      
    //Entrada de metros quadrados que necessita pintar
    System.out.println("Informe em metros quadrados a área a ser pintada: ");
    float metro = loja.nextFloat();
    
    //Cálculo de quantos metros quadrados uma lata pinta
    float lata_litro = 18;
    float um_litro = 3;
    float uma_lata = lata_litro * um_litro;

    //Resultado de quantas latas necessitará.
    float area = metro / uma_lata;
    System.out.println("Latas necessária: " + area);

    //Valor para pagar.
    float valor_lata = 80;
    float resul = area * valor_lata;
    System.out.println("O valor será: " + resul);

    System.out.println("Obrigado por participar!");
    
  }
}