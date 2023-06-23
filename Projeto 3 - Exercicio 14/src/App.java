public class App {
    public static void main(String[] args) {
        Funcionario harry = new Funcionario("Harry", 25000);
        harry.aumentarSalario(10);
        System.out.println("Novo salário de " + harry.getNome() + ": " + harry.getSalario());
    }
}
