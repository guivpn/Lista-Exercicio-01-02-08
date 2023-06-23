public class Macaco {
    public String nome;
    public String bucho;

    public Macaco (String nome) {
        this.nome = nome;
        this.bucho = "";
    }

    public void comer (String alimento) {
        if (bucho.isEmpty()) {
            bucho += alimento;
        } else {
            bucho += ", " + alimento;
        }
    }

    public void verBucho ()  {
        if (bucho.isEmpty()) {
            System.out.println(nome + "está com o estomago está vazio! ");
        } else {
            System.out.println(nome + " tem no estomago: " + bucho);
        }
    }

    public void digerir () {
        if (bucho.isEmpty()) {
            System.out.println(nome + " não tem nada para digerir. ");
        } else {
            System.out.println(nome + " está digerindo: " + bucho);
            bucho = "";
        }
    }
}
