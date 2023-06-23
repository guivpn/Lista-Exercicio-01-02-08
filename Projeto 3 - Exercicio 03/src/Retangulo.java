public class Retangulo {
    public double cumprimento;
    public double largura;

    public void mudarValorLado(double novoValorLadoCumprimento, double novoValorLadolargura) {
        cumprimento = novoValorLadoCumprimento;
        largura = novoValorLadolargura;
    }

    public double retornarValorLadoC() {
        return cumprimento;
    }

    public double retornarValorLadoL() {
        return largura;
    }

    public double calcularArea() {
        return cumprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (cumprimento + largura);
    }
}
