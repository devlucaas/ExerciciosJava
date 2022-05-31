package LISTAV.Q7;

public class Capitulo {
    int numeroCapitulo;
    String nomeCapitulo;

    public Capitulo(){
    }

    public Capitulo(int numeroCapitulo, String nomeCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
        this.nomeCapitulo = nomeCapitulo;
    }

    public int getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(int numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    public String getNomeCapitulo() {
        return nomeCapitulo;
    }

    public void setNomeCapitulo(String nomeCapitulo) {
        this.nomeCapitulo = nomeCapitulo;
    }  
}
