public class BichinhoVirtual {
    public String nome;
    public int fome;
    public int saude;
    public int idade;

    public void alterarNome (String novoNome) {
        nome = novoNome;
    }

    public void alterarFome (int novaFome) {
        fome = novaFome;
    }

    public void alterarSaude (int novaSaude) {
        saude = novaSaude;
    }

    public void alterarIdade (int novaIdade) {
        idade = novaIdade;
    }

    public double retornarHumor () {
        return (fome + saude) / 2;
    }

    //Getters
    public String getNome () {
        return nome;
    }

    public int getFome () {
        return fome;
    }

    public int getSaude () {
        return saude;
    }

    public int getIdade () {
        return idade;
    }
}
