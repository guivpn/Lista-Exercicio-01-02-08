public class TV {
    private int canal; 
    private int volume;

    public TV () {
        canal = 1;
        volume = 50;
    }

    public void mudarCanal (int novoCanal) {
        if(canal >= 1 && canal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Canal inválido! ");
        }
    }

    public void aumentarVolume (int novoVolumeAumentado) {
        if(volume <= 100) {
            volume = novoVolumeAumentado;
            System.out.println("O volume foi alterado para: " + volume);
        } else {
            System.out.println("Volume inválido! ");
        }
    }

    public void diminuirVolume (int novoVolumeDiminuido) {
        if(volume >= 0) {
            volume = novoVolumeDiminuido;
            System.out.println("O valume foi alterado para: " + volume);
        }
    }

    public int getCanal () {
        return canal;
    }

    public int getVolume () {
        return volume;
    }
}
