import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FazendaDeBichinhos {
    private List<Bichinho> bichinhos;

    public FazendaDeBichinhos() {
        bichinhos = new ArrayList<>();
        bichinhos.add(new Bichinho("Bichinho 1", gerarNivelInicial(), gerarNivelInicial()));
        bichinhos.add(new Bichinho("Bichinho 2", gerarNivelInicial(), gerarNivelInicial()));
        bichinhos.add(new Bichinho("Bichinho 3", gerarNivelInicial(), gerarNivelInicial()));
    }

    private int gerarNivelInicial() {
        Random random = new Random();
        return random.nextInt(50) + 1;
    }

    public void alimentarTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.alimentar();
        }
    }

    public void brincarTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.brincar();
        }
    }

    public void ouvirTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.ouvir();
        }
    }

    public void passarTempo() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.passarTempo();
        }
    }

    public void verificarEstadoTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.verificarEstado();
        }
    }
}
