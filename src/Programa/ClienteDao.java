package Programa;

import java.util.ArrayList;

public class ClienteDao {
    Cliente aux = new Cliente();

    Cliente[] vcli = new Cliente[10];
    ArrayList<Cliente> listacli = new ArrayList();

    public void criarCliente(Cliente cliexemplo) {
        for (int i = 0; i < vcli.length; i++) {
            if (vcli[i] == null) {
                vcli[i].setNome(cliexemplo.getNome());
                vcli[i].setCpf(cliexemplo.getCpf());
                vcli[i].setCd(cliexemplo.getCd());

            }
        }
    
    }
    

    public ArrayList<Cliente> pesquisarNome(String exnome) {
        for (int i = 0; i < vcli.length; i++) {
            if (vcli[i].getNome() == exnome) {
                listacli.add(vcli[i]);
            }
        }
        return listacli;
    }
  
    public Cliente pesquisarCd(int cd){
        for(int i=0; i <vcli.length;i++){
            if(cd == vcli[i].getCd()){
                aux = vcli[i];
                
            }
        }
        return aux;      
    }
    
    public void editarNome(int cd, String nome){
        for(int i = 0; i<vcli.length ; i++){
            if(cd == vcli[i].getCd()){
                vcli[i].setNome(nome);
            }
        }
    }
    
    public void editarcpf(int cd, String cpf){
        for(int i = 0; i<vcli.length ; i++){
            if(cd == vcli[i].getCd()){
                vcli[i].setNome(cpf);
            }
        }
    }
    
    public void excluir(int cd){
        for(int i = 0 ;i<vcli.length;i++){
            if(cd == vcli[i].getCd()){
                vcli[i]= null;
            }
        }
    }
    
    
    
    
}