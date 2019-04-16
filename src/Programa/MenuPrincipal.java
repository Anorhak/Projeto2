/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.util.Scanner;

/**
 *
 * @author Everton
 */
public class MenuPrincipal implements Menu {

   private String item[] = new String[]{"Celular","Funcionario","Fornecedor","Serviço","Cliente","Produto"};
   private Menu[] telas = new Menu[]{new CelularMenu(),new FuncionarioMenu(),new FornecedorMenu(),new ServicoMenu(),ClienteMenu(),ProdutoMenu()};
    
    @Override
    public void executar() {
        Scanner teclado = new Scanner(System.in);
        int op = -1;
        while(op!=item.length){
            System.out.println("Menu Principal");
            for (int i = 0; i < item.length; i++) {
                System.out.println(i+" - "+ item[i]);
            }
            System.out.println(item.length+ " - Sair");
            System.out.println("Escolha uma Opção");
            op = Integer.parseInt(teclado.nextLine());
            if (op>=0 && op<item.length){
                telas[op].executar();
            }else if (op!=item.length){
                System.out.println("Opção Invalida");
            }
        }
    }

    private Menu ClienteMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Menu ProdutoMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
