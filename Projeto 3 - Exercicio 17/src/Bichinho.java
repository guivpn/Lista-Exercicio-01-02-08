public class Bichinho {
    private String nome;
    private int fome;
    private int tedio;

    public Bichinho(String nome, int fome, int tedio) {
        this.nome = nome;
        this.fome = fome;
        this.tedio = tedio;
    }

    public void alimentar() {
        fome -= 10;
        System.out.println(nome + " foi alimentado.");
    }

    public void brincar() {
        tedio -= 10;
        System.out.println(nome + " brincou.");
    }

    public void ouvir() {
        System.out.println(nome + " está feliz!");
    }

    public void passarTempo() {
        fome += 5;
        tedio += 5;
    }

    public void verificarEstado() {
        if (fome >= 50) {
            System.out.println(nome + " está com fome!");
        }
        if (tedio >= 50) {
            System.out.println(nome + " está entediado!");
        }
    }
}
