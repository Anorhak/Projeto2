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
        Cliente cliexemplo = new Cliente();
        ClienteDao b = new ClienteDao();
        
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
                vmenu = sci.nextInt();
                
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
                    System.out.println("1-Marca");
                    System.out.println("2-Modelo");
                    int menu = scs.nextInt();
                    if(menu == 1){
                        System.out.println("Informe a marca atualizada");
                        String marca = scs.nextLine();
                        a.editarMarca(cd,marca);
                    }else if(menu == 2){
                        System.out.println("Informe o modelo atualizado");
                        String modelo = scs.nextLine();
                        a.editarModelo(cd, modelo);
                        
                    }
                }else if(vmenu == 4){
                    System.out.println("Informe o código desejado");
                    String cd = scs.nextLine();
                    a.excluir(cd);
                    
                }
                
            }else if(vmenu == 2){
                System.out.println("1-Criar");
                System.out.println("2-Ler");
                System.out.println("3-Editar"); //menu
                System.out.println("4-Excluir");
                System.out.println("5-Voltar");
                vmenu = sci.nextInt();
                if(vmenu == 1){
                    System.out.println("Informe o nome");
                    cliexemplo.setNome(scs.nextLine());
                    System.out.println("Informe o CPF");
                    cliexemplo.setCpf(scs.nextLine());
                    System.out.println("Informe o código");
                    cliexemplo.setCd(scs.nextLine());
                    b.criarCliante(cliexemplo);
                    
                    
                }else if(vmenu == 2){
                    System.out.println("1-Pesquisar por nome");
                    System.out.println("2-Pesquisar por código");
                    vmenu = sci.nextInt();
                    if(vmenu == 1){
                        System.out.println("Informe o nome");
                        String nome = scs.nextLine();
                        b.pesquisarNome(nome);
                    }else if(vmenu == 2){
                        System.out.println("Informe o código");
                        String cd = scs.nextLine();
                        
                        
                    }
                    
                    
                
            }
                
                
            }
            
            
        }while(vmenu != 0);

    }

}
