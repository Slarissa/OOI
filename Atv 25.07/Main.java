public class Main {
    public static void main(String[] args) {

        Musico musico = new Musico("Musico Teste", "teste@gmail.com");

        Musica musica = new Musica("Musica Teste", 30);

        Banda banda = new Banda("BandaTeste", null, null);

        CD cd = new CD(null, 0, false, banda, null);

        System.out.println(musico + "\n");
        System.out.println(musica + "\n");
        System.out.println(banda + "\n");
        // System.out.println(cd);

    }
}