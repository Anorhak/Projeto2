package Programa;

import java.util.ArrayList;

public class CelularDao {

    Celular[] vcel = new Celular[5];
    ArrayList<Celular> listacel = new ArrayList();
    public boolean criarCelular(Celular exemplo) {
        boolean r = false;
        for (int i = 0; i <= vcel.length; i++) {
            if (vcel[i] == null) {
                vcel[i] = exemplo;
                r = true;
            } else {
                r = false;
            }
        }
        return r;
    }

    public void pesquisarcd(String cd) {
        for (int i = 0; i <= vcel.length; i++) {
            if (vcel[i].getCd() == cd) {
                System.out.println("Marca: " + vcel[i].getMarca());
                System.out.println("Modelo: " + vcel[i].getModelo());
                System.out.println("Cd: " + vcel[i].getCd());
            }
        }
    }

    public  ArrayList<Celular>  pesquisarmarca(Celular exemplo) {
        for(int i = 0; i<=vcel.length; i++){
            if(vcel[i].getMarca().equalsIgnoreCase(exemplo.getMarca())){
                listacel.add(vcel[i]);
                
            }else if(vcel[i].getModelo().equalsIgnoreCase(exemplo.getModelo())){
                listacel.add(vcel[i]);
            }
        } 
        return listacel;    
    }
    public void editarCel(){
        
        
        
    }
    

}
