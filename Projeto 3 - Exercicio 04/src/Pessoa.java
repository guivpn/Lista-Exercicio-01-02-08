public class Pessoa {
    public String nome;
    public int idade;
    public double peso;
    public double altura;

    public Pessoa(String novoNome, int novaIdade, double novoPeso, double novaAltura) {
        this.nome = novoNome;
        this.idade = novaIdade;
        this.peso = novoPeso;
        this.altura = novaAltura;
    }

    public void envelhecer(double novaIdade) {
        this.idade++;

        if (this.idade < 21) {
            crescer(0.5);
        }
    }

    public void engordar(double pesoGanho) {
        this.peso += pesoGanho;
    }
    
    public void emagrecer(double pesoPerdido) {
        this.peso -= pesoPerdido;
    }

    public void crescer(double alturaGanha) {
        this.altura = alturaGanha;
    }

    //Getters e Setters

    public String getNome() {
        System.out.println("Ual ual!");
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double novaAltura) {
        this.altura = novaAltura;
    }
}
