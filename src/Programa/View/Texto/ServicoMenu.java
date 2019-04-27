/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa.View.Texto;

/**
 *
 * @author Everton
 */
class ServicoMenu extends Menu {

    public ServicoMenu() {
        this.tituloMenu = "Menu Serviço";
        this.item = new String[]{"Inserir", "Pesquisar"," ","Cliente", "Funcionario", "Fornecedor" };
        this.telas = new ITela[]{new ServicoMenu(), new ProdutoMenu(), new CelularMenu(), new ClienteMenu(), new FuncionarioMenu(), new FornecedorMenu()};
    }

    
}
