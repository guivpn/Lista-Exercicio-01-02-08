public class Carro {
    private double consumoCombustivel; 
    private double nivelCombustivel; 

    public Carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.nivelCombustivel = 0;
    }

    public void andar(double distancia) {
        double combustivelConsumido = distancia / this.consumoCombustivel;
        if (combustivelConsumido <= this.nivelCombustivel) {
            this.nivelCombustivel -= combustivelConsumido;
            System.out.println("O carro percorreu " + distancia + " km.");
        } else {
            System.out.println("Combustível insuficiente para percorrer a distância especificada.");
        }
    }

    public double obterGasolina() {
        return this.nivelCombustivel;
    }

    public void adicionarGasolina(double quantidade) {
        this.nivelCombustivel += quantidade;
        System.out.println("Abastecido com " + quantidade + " litros de combustível.");
    }
}