import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a coordenada x do vértice inferior esquerdo: ");
        int x = teclado.nextInt();

        System.out.print("Digite a coordenada y do vértice inferior esquerdo: ");
        int y = teclado.nextInt();

        Ponto pontoInicial = new Ponto(x, y);

        System.out.print("Digite a largura do retângulo: ");
        int largura = teclado.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        int altura = teclado.nextInt();
        Retangulo retangulo = new Retangulo(pontoInicial, largura, altura);
        //Retangulo retangulo = new Retangulo(pontoInicial, largura, altura);

        Ponto centro = retangulo.encontrarCentro();
        centro.imprimir();

        teclado.close();
    }
}
