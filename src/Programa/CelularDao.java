package Programa;

import java.util.ArrayList;

public class CelularDao {

   static  Celular[] vcel = new Celular[5];
   static  ArrayList<Celular> listacel = new ArrayList();
   static Celular aux = new Celular();
   
   
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

    public Celular pesquisarcd(int cd) {
        for (int i = 0; i <= vcel.length; i++) {
            if (vcel[i].getCd() == cd) {
                aux = vcel[i];
            }
        }
        return aux;
    }

    public  ArrayList<Celular>  pesquisarmarca(Celular exemplo) {
        for(int i = 0; i<=vcel.length; i++){
            if(vcel[i].getMarca().equalsIgnoreCase(exemplo.getMarca())){
                listacel.add(vcel[i]);
            }   

        } 
        return listacel;    
    }
    public void editarMarca(int cd , String marca){
        for(int i=0; i<vcel.length; i++){
            if( vcel[i].getCd() == cd){
                vcel[i].setMarca(marca);   
            }
        }
    }   
    public void editarModelo(int cd, String modelo){
        for(int i = 0; i<vcel.length; i++){
            if( vcel[i].getCd() == cd){
                vcel[i].setModelo(modelo);
            }
        }
        
    }
    public void excluir(int cd){
        for(int i=0; i<vcel.length;i++){
            if(vcel[i].getCd() == cd){
                vcel[i] = null;
            }
        }
    }
        
        
        
    }
    


