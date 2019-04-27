package Programa.Dao;

import Programa.Entidades.Produto;
import java.util.ArrayList;

public class ProdutoDao {
   static  Produto[] vpro = new Produto[5];
   static  ArrayList<Produto> listapro = new ArrayList();
   static Produto aux = new Produto();
   
    public void criarProduto(Produto exemplopro) {
        for (int i = 0; i < vpro.length; i++) {
            if (vpro[i] == null) {
                vpro[i].setNome(exemplopro.getNome());
                vpro[i].setCd(exemplopro.getCd());
                vpro[i].setPreco(exemplopro.getPreco());

            }
        }
    
    }
    public Produto pesquisarcd(int cd) {
        for (int i = 0; i <= vpro.length; i++) {
            if (vpro[i].getCd() == cd) {
                aux = vpro[i];
            }
        }
        return aux;
    }    
 
    public ArrayList<Produto> pesquisarNome(String exnome) {
        for (int i = 0; i < vpro.length; i++) {
            if (vpro[i].getNome() == exnome) {
                listapro.add(vpro[i]);
            }
        }
        return listapro;
    }    
    
    public void editarNome(int cd, String nome){
        for(int i = 0; i<vpro.length ; i++){
            if(cd == vpro[i].getCd()){
                vpro[i].setNome(nome);
            }
        }
    }   
    public void editarPreco(int cd, float preco){
        for(int i = 0; i<vpro.length ; i++){
            if(cd == vpro[i].getCd()){
                vpro[i].setPreco(preco);
            }
        }
    } 
    
    public void excluir(int cd){
        for(int i = 0 ;i<vpro.length;i++){
            if(cd == vpro[i].getCd()){
                vpro[i]= null;
            }
        }
    }
    
    

}
