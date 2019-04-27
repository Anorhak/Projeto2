package Programa.Dao;

import Programa.Entidades.Fornecedor;
import java.util.ArrayList;

public class FornecedorDao {
    static Fornecedor[] vfor = new Fornecedor[5];
    static  ArrayList<Fornecedor> listafor = new ArrayList();
    static Fornecedor aux = new Fornecedor();
    
    public void criarFor(Fornecedor exemplofor){
        for(int i =0;i<vfor.length;i++){
            if(vfor == null){
                vfor[i].setCd(exemplofor.getCd());
                vfor[i].setCnpj(exemplofor.getCnpj());
                vfor[i].setContato(exemplofor.getContato());
                vfor[i].setNome(exemplofor.getNome());
                
            }
        }
    }
    
    public ArrayList<Fornecedor>  pesquisarNome(String nome){
        for(int i =0;i<vfor.length;i++){
            if(vfor[i].getNome() == nome){
                listafor.add(vfor[i]);
            }
        }
        return listafor;
        
    }
    public Fornecedor pesquisarCd(int cd){
        for(int i=0; i<vfor.length;i++){
            if(cd == vfor[i].getCd()){
                aux = vfor[i];
                
            }
        }
        return aux;
    }
    
    public void editarNome(int cd , String nome){
        for(int i=0; i<vfor.length; i++){
            if( vfor[i].getCd() == cd){
                vfor[i].setNome(nome);   
            }
        }
    }
    public void editarCnpj(int cd , String cnpj){
        for(int i=0; i<vfor.length; i++){
            if( vfor[i].getCd() == cd){
                vfor[i].setCnpj(cnpj);   
            }
        }
    }
    public void editarontato(int cd , String contato){
        for(int i=0; i<vfor.length; i++){
            if( vfor[i].getCd() == cd){
                vfor[i].setContato(contato);   
            }
        }
    }
    
    public void excluir(int cd){
        for(int i=0;i<vfor.length;i++){
            if(cd == vfor[i].getCd()){
                vfor[i] = null;            
            }
        }
    }
    
    
    
}


