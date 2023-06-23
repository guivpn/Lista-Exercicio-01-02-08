public class Quadrado {
    public double tamanhoLado;

    public void mudarValorLado(double novoValor) {
        tamanhoLado = novoValor;
    }

    public double retornarValorLado() {
        return tamanhoLado;
    }

    public void carlularArea() {
        Math.pow(tamanhoLado, tamanhoLado);
    }
}
