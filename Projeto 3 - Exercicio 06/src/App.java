public class App {
    public static void main(String[] args) throws Exception {
        TV teste = new TV();

        teste.mudarCanal(0);
        teste.aumentarVolume(0);
        teste.diminuirVolume(0);
        
        System.out.println(teste.getCanal());
        System.out.println(teste.getVolume());
    }
}
