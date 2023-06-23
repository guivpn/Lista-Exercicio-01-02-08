import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        Scanner teclado = new Scanner(System.in);

        System.out.println("SISTEMA DE CÁLCULO DE ARÉA DE DETERMINADO LOCAL. ");

        System.out.println("Informe o cumprimento de um retângulo: ");
        Double cumprimento = teclado.nextDouble();

        System.out.println("Informe a largura do retângulo: ");
        Double largura = teclado.nextDouble();

        teclado.close();

        retangulo.mudarValorLado(cumprimento, largura);
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();

        //Peças
        double pisos = 30 * 30;
        double rodapes = 10 * 10;

        //Quantidade de pisos
        double quantidadePisos = area / pisos;

        //Quantidade de rodapés
        double quantidadeRodapes = perimetro / rodapes;

        System.out.println("Quantidades de pisos: " + quantidadePisos);
        System.out.println("Quantidade rodapés:  " + quantidadeRodapes);
    }
}
