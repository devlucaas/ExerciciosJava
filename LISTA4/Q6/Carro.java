package LISTA4.Q6;

public class Carro {
    private String marca, modelo;
    private int ano;
    private String tipo;

    public Carro(String marca, String modelo, int ano, String tipo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String toString(){
        return String.format("Marca: %s\nModelo: %s\nAno: %d\nTipo do Combustível: %s", this.marca, this.modelo, this.ano, this.tipo);
    }
}
