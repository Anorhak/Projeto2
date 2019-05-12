package Programa.View.Texto;



public final class MenuPrincipal extends Menu {

    public MenuPrincipal() {
        this.tituloMenu = "Menu Principal";
        this.item = new String[]{"Serviços", "Produtos", "Celular", "Cliente", "Funcionario", "Fornecedor"};
        this.telas = new ITela[]{new ServicoMenu(), new ProdutoMenu(), new CelularMenu(), new ClienteMenu(), new FuncionarioMenu(), new FornecedorMenu()};
    }

}
