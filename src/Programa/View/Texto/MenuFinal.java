/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa.View.Texto;

import Programa.Util.Scanners;


/**
 *
 * @author Everton
 */
abstract class MenuFinal extends Menu implements ICrud {

    public MenuFinal(){
        this.tituloMenu = "";
        this.item = new String[] {"Inserir", "Alterar", "Pesquisar", "Excluir"};
    }
    @Override
    public void executar() {
         int op = -1;
        while (op != item.length) {
            System.out.println(tituloMenu);
            for (int i = 0; i < item.length; i++) {
                System.out.println(i + " - " + item[i]);
            }
            System.out.println(item.length + " - Sair");
            System.out.println("Escolha uma Opção");
            op = new Scanners().lerInteiro();
            switch (op){
                case 0:
                    inserir(); break;
                case 1:
                    alterar(); break;
                case 2:
                    pesquisar(); break;
                case 3:
                    excluir();break;
                default:
                    System.out.println("opção invalida");break;
                    
            }
        }
    }
    
    
}
