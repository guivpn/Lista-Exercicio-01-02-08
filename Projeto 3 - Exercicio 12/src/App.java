public class App {
   public static void main(String[] args) {
        ContaInvestimento poupanca = new ContaInvestimento(1000.00, 10.0);

        for (int i = 1; i <= 5; i++) {
            poupanca.adicioneJuros();
            System.out.println("Saldo após " + i + "ª aplicação de juros: R$" + poupanca.getSaldo());
        }
    }
}

