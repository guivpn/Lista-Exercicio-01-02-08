public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentualDeAumento) {
        double aumento = salario * (porcentualDeAumento / 100);
        salario += aumento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}