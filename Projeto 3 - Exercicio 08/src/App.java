public class App {
    public static void main(String[] args) throws Exception {
        Macaco macaco1 = new Macaco("Macaco1");
        Macaco macaco2 = new Macaco("Macaco2");

        macaco1.comer("Banana");
        macaco1.comer("Maçã");
        macaco1.comer("Pêssego");

        macaco2.comer("Amendoim");
        macaco2.comer("Laranja");
        macaco2.comer("Uva");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.digerir();
        macaco2.digerir();

        macaco1.verBucho();
        macaco2.verBucho();
    }
}
