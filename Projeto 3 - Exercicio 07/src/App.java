public class App {
    public static void main(String[] args) throws Exception {
        BichinhoVirtual bichinho = new BichinhoVirtual();

        bichinho.alterarFome(70);
        bichinho.alterarSaude(80);
        bichinho.alterarIdade(2);

        System.out.println("Nome: " + bichinho.getNome());
        System.out.println("Fome: " + bichinho.getFome());
        System.out.println("Saúde: " + bichinho.getSaude());
        System.out.println("Idade: " + bichinho.getIdade());
        System.out.println("Humor: " + bichinho.retornarHumor());
    }
}
