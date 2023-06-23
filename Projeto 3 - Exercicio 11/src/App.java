public class App {
        public static void main(String[] args) {
        Carro meuFusca = new Carro(15); // 15 quilômetros por litro de combustível.
        meuFusca.adicionarGasolina(20); // abastece com 20 litros de combustível.
        meuFusca.andar(100); // anda 100 quilômetros.
        System.out.println("Combustível restante: " + meuFusca.obterGasolina() + " litros.");
    }
}

