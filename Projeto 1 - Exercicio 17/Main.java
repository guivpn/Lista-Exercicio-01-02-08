import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner loja = new Scanner(System.in);

    System.out.println("Informe a tamanho em metros quadrados da área a ser pintada: ");
    double loja1 = loja.nextDouble();

    //  18 litros.
    double seis_metro = 6;
    double litros = 18;
    double total_umalata = seis_metro * litros;
    double valor = 80;

    //  Galões de 3,6 litros.
    double seis_metro1 = 6;
    double litros1 = 3.6;
    double total_umgalao = seis_metro1 * litros1;
    double valor1 = 25;

    // Logica de processamento
    double resul = loja1 / total_umalata;
    System.out.println("Latas necessárias: " + resul);
    double resul1= loja1 / total_umgalao;
    System.out.println("Galões necessários: " + resul1);

    //Entretenimento
    System.out.println("Valores das latas e galões de acordo com a metragem referida: ");

    //Valores em três situações
    double valores = resul * valor;
    System.out.println("Valor ao comprar apenas latas de 18 litros: " + valores);

    double valores1 = resul1 * valor1;
    System.out.println("Valor ao comprar apenas galões: " + valores1);

    /////////////////////////////////////////////////
    //Folga
    double folga = resul * 10 / 100;
    System.out.println("Porcentagem; " + folga);

    double folga1 = resul1 * 10 / 100;
    System.out.println("Porcentagem2: " + folga1);

    //Subtração 
    Double sub = folga - resul;
    System.out.println("teste2; " + sub);
    
    Double sub1 = folga1 - resul1;
    System.out.println("Teste1; " + sub1);
    /////////////////////////////////////////////////
  
    
    
  }
}