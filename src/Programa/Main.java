package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        new Principal().setVisible(true);
        
        
        Scanner sci = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        
        CelularDao a = new CelularDao();
        Celular exemplo = new Celular();
        
        ArrayList<Celular> listaex = new ArrayList();
        
        
        int vmenu;
        do{
            System.out.println("----------------MENU---------------");
            System.out.println("1-Celulares");
            System.out.println("2-Cliente");
            
            
            
            
            vmenu = sci.nextInt();
            if(vmenu == 1){
                System.out.println("1-Criar");
                System.out.println("2-Ler");
                System.out.println("3-Editar"); //menu
                System.out.println("4-Excluir");
                System.out.println("5-Voltar");
                
                if(vmenu == 1){
                    
                    
                    
                    System.out.println("Informe a marca do celular: ");
                    exemplo.setMarca(scs.nextLine());
                    System.out.println("Informe o modelo do celular: ");    //leitura celulares
                    exemplo.setModelo(scs.nextLine());
                    System.out.println("Informe o código do celular: ");
                    exemplo.setCd(scs.nextLine()); 
                    
                    boolean saida = a.criarCelular(exemplo);
                    
                    if(saida == true){
                        System.out.println("Celular criado com sucesso ");
                    }else{
                        System.out.println("Falha ");
                    }
                    
                }else if(vmenu == 2){
                    System.out.println("1-Pesquisar por código ");
                    System.out.println("2-Pesquisar por modelo/marca ");
                    System.out.println("3-Voltar");
                    vmenu = sci.nextInt();
                    if(vmenu == 1){
                        
                        System.out.println("Informe o código: ");
                        String cd = scs.nextLine();
                        a.pesquisarcd(cd);
                    }else if(vmenu == 2){
                        System.out.println("Informe o modelo");
                        exemplo.setModelo(scs.nextLine());
                        System.out.println("Indforme uma marca");
                        exemplo.setModelo(scs.nextLine());
                        listaex = a.pesquisarmarca(exemplo);
                        for(int i = 0; i<=listaex.size();i++){
                            System.out.println("Código: "+listaex.get(i));
                            System.out.println("Marca: "+listaex.get(i));
                            System.out.println("Modelo: "+listaex.get(i));
                            
                        }
                        
                        
                    }else{
                        System.out.println("Não é um comando ");
                    }
                }else if(vmenu==3){
                    System.out.println("Informe o código do celular");
                    String cd = scs.nextLine();
                    
                    
                    
                }
                
            }
        }while(vmenu != 0);

    }

}
