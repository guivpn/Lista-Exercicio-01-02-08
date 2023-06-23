public class App {
    public static void main(String[] args) {
        BichinhoVirtual bichinho = new BichinhoVirtual();

        bichinho.alimentar(3); // Alimenta o bichinho com 3 unidades de comida
        bichinho.brincar(2); // Brinca com o bichinho por 2 horas
        bichinho.passarTempo(5); // Passa 5 horas

        bichinho.exibirStatus(); // Exibe os níveis atualizados
    }
}
