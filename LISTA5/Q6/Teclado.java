package LISTA5.Q6;

public class Teclado {
    int numeroTeclas;
    boolean led;

    public Teclado(){
    }

    public Teclado(int numeroTeclas, boolean led) {
        this.numeroTeclas = numeroTeclas;
        this.led = led;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public boolean isLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

    
}
