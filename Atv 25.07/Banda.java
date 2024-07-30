import java.util.List;

public class Banda {

    private String nome;
    private EnumEstilo estilo;

    private List<Musico> musicos;

    public Banda(String nome, EnumEstilo estilo, List<Musico> musicos) {
        this.nome = nome;
        this.estilo = estilo;
        this.musicos = musicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumEstilo getEstilo() {
        return estilo;
    }

    public void setEstilo(EnumEstilo estilo) {
        this.estilo = estilo;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(List<Musico> musicos) {
        this.musicos = musicos;
    }

    public String toString() {
        return "Banda{" +
                "nome = '" + nome + '\'' +
                ", estilo = " + estilo +
                ", musicos=" + musicos +
                '}';
    }
}