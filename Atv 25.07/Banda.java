public class Banda{
    
    private String nome;
    private EnumEstilo estilo;
    
    public Banda(String nome, EnumEstilo estilo) {
        this.nome = nome;
        this.estilo = estilo;
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

    public String toString() {
        return "Banda{" +
                "nome = '" + nome + '\'' +
                ", estilo = " + estilo +
                '}';
    }
}