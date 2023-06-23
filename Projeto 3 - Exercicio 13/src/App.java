public class App {
    public static void main(String[] args) {
        // Criando um objeto Funcionario
        Funcionario funcionario = new Funcionario("João", 2500.0);

        // Obtendo o nome e o salário do funcionário
        String nome = funcionario.getNome();
        double salario = funcionario.getSalario();

        // Exibindo os dados do funcionário
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }
}