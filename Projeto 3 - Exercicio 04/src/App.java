//import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Gui", 18, 70, 1.78);

        pessoa.getNome();
        pessoa.setAltura(2.55);
        pessoa.setIdade(38);
        pessoa.setPeso(180);
        pessoa.setNome("João");
        System.out.println("Novo nome; " + pessoa.getNome());
        System.out.println("Nova Idade: " + pessoa.getIdade());
        System.out.println("Novo Peso: " + pessoa.getPeso());
        System.out.println("Nova Altura: " + pessoa.getAltura());
    }
}
