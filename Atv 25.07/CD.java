public class CD{
    
    private String titulo;
    private int ano;
    private boolean ehDuplo;

    public CD(String titulo, int ano, boolean ehDuplo) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEhDuplo() {
        return ehDuplo;
    }

    public void setEhDuplo(boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }

    public String toString() {
        return "CD{" +
                "titulo = '" + titulo + '\'' +
                ", ano = " + ano +
                ", ehDuplo = " + ehDuplo +
                '}';
    }
}