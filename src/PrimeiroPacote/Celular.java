package PrimeiroPacote;

public class Celular {
    private String modelo;
    private String marca;
    private String cd;

    public Celular(String modelo, String marca, String cd) {
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

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }
    
    

}
