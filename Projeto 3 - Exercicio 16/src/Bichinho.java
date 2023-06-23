public class Bichinho {
    private String nome;
    private int idade;
    private int energia;

    // Construtor
    public Bichinho(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.energia = 100;
    }

    // Método para alimentar o bichinho
    public void comer() {
        // Lógica para aumentar a energia ao comer
        energia += 10;
        System.out.println("O bichinho " + nome + " comeu e ganhou energia!");
    }

    // Método para brincar com o bichinho
    public void brincar() {
        // Lógica para diminuir a energia ao brincar
        energia -= 20;
        System.out.println("O bichinho " + nome + " brincou e perdeu energia!");
    }

    // Método especial para retornar uma representação textual dos atributos
    public String str() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nEnergia: " + energia;
    }
}