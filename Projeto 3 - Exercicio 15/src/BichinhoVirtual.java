public class BichinhoVirtual {
    private int nivelFome;
    private int nivelTedio;

    public BichinhoVirtual() {
        nivelFome = 0;
        nivelTedio = 0;
    }

    public void alimentar(int quantidadeComida) {
        nivelFome -= quantidadeComida;
        if (nivelFome < 0) {
            nivelFome = 0;
        }
    }

    public void brincar(int tempoBrincadeira) {
        nivelTedio -= tempoBrincadeira;
        if (nivelTedio < 0) {
            nivelTedio = 0;
        }
    }

    public void passarTempo(int horas) {
        nivelFome += horas;
        nivelTedio += horas;
    }

    public void exibirStatus() {
        System.out.println("Nível de Fome: " + nivelFome);
        System.out.println("Nível de Tédio: " + nivelTedio);
    }
}