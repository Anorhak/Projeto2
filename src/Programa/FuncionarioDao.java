package Programa;

import java.util.ArrayList;

public class FuncionarioDao {
        Cliente aux = new Cliente();

    Cliente[] vfun = new Cliente[10];
    ArrayList<Cliente> listafun = new ArrayList();

    public void criarFun(Cliente cliexemplo) {
        for (int i = 0; i < vfun.length; i++) {
            if (vfun[i] == null) {
                vfun[i].setNome(cliexemplo.getNome());
                vfun[i].setCpf(cliexemplo.getCpf());
                vfun[i].setCd(cliexemplo.getCd());

            }
        }
    
    }
    

    public ArrayList<Cliente> pesquisarNome(String exnome) {
        for (int i = 0; i < vfun.length; i++) {
            if (vfun[i].getNome() == exnome) {
                listafun.add(vfun[i]);
            }
        }
        return listafun;
    }
  
    public Cliente pesquisarCd(int cd){
        for(int i=0; i <vfun.length;i++){
            if(cd == vfun[i].getCd()){
                aux = vfun[i];
                
            }
        }
        return aux;      
    }
    
    public void editarNome(int cd, String nome){
        for(int i = 0; i<vfun.length ; i++){
            if(cd == vfun[i].getCd()){
                vfun[i].setNome(nome);
            }
        }
    }
    
    public void editarcpf(int cd, String cpf){
        for(int i = 0; i<vfun.length ; i++){
            if(cd == vfun[i].getCd()){
                vfun[i].setNome(cpf);
            }
        }
    }
    
    public void excluir(int cd){
        for(int i = 0 ;i<vfun.length;i++){
            if(cd == vfun[i].getCd()){
                vfun[i]= null;
            }
        }
    }
    
}