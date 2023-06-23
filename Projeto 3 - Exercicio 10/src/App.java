public class App {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 4.5, 1000);

        bomba.abastecerPorValor(50); // Abastece com R$ 50

        bomba.abastecerPorLitro(20); // Abastece com 20 litros

        bomba.alterarValor(5.0); // Altera o valor para R$ 5.0

        bomba.alterarCombustivel("Etanol"); // Altera o tipo para Etanol

        bomba.alterarQuantidadeCombustivel(500); // Altera a quantidade para 500 litros
    }
}