package Programa.Entidades;

public class Celular {
    private String modelo;
    private String marca;
    private int cd;

    public Celular(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.cd = cd;
    }
    
    public Celular(){
    
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }





    

}
