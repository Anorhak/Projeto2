package Programa.Dao;

import Programa.Entidades.Servico;
import java.util.ArrayList;

public class ServicoDao {
   static  Servico[] vser = new Servico[5];
   static  ArrayList<Servico> listaser= new ArrayList();
   static Servico aux = new Servico();
   
    public boolean criarCelular(Servico exemploser) {
        boolean r = false;
        for (int i = 0; i <= vser.length; i++) {
            if (vser[i] == null) {
                vser[i] = exemploser;
                r = true;
            } else {
                r = false;
            }
        }
        return r;
    }  
    public Servico pesquisarcd(int cd) {
        for (int i = 0; i <= vser.length; i++) {
            if (vser[i].getCd() == cd) {
                aux = vser[i];
            }
        }
        return aux;
    }  
    public ArrayList<Servico> pesquisarNome(String exemploser) {
        for (int i = 0; i < vser.length; i++) {
            if (vser[i].getNome() == exemploser) {
                listaser.add(vser[i]);
            }
        }
        return listaser;
    } 
    public void editarNome(int cd, String nome){
        for(int i = 0; i<vser.length ; i++){
            if(cd == vser[i].getCd()){
                vser[i].setNome(nome);
            }
        }
    }   
    public void editarPreco(int cd, float preco){
        for(int i = 0; i<vser.length ; i++){
            if(cd == vser[i].getCd()){
                vser[i].setPreco(preco);
            }
        }
    }   
    public void excluir(int cd){
        for(int i = 0 ;i<vser.length;i++){
            if(cd == vser[i].getCd()){
                vser[i]= null;
            }
        }
    }
        

}
