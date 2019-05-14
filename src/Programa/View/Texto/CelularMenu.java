/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa.View.Texto;

import Programa.Util.Scanners;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Everton
 */
final class CelularMenu extends MenuFinal {

    public CelularMenu() {
        this.tituloMenu = "Menu Celular";
        this.item = new String[]{"Inserir", "Alterar", "Pesquisar", "Excluir"};

    }

    @Override
    public void inserir() {
        System.out.println("------Inserir Celular------");
        System.out.println("Por Favor Informe a Marca do Celular?");
        String marca = new Scanners().lerString();
        System.out.println("Por Favor Informe o Modelo do Celular.");
        String modelo = new Scanners().lerString();
        try {
            new Programa.Dao.CelularDao().inserir(new Programa.Entidades.Celular(modelo, marca));
        } catch (Exception ex) {
            Logger.getLogger(CelularMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void alterar() {
        try {
            String campos[] = new String[]{"NmModelo","NmMarca"};
            System.out.println("------Alterar Celular------");
            System.out.println("Por Favor Selecione oq vc quer alterar");
            for (int i = 0; i < campos.length;System.out.println(i+" - "+campos[i++]));
            int opcao = new Scanners().lerInteiro();
            System.out.println("Por Favor Digite o novo "+campos[opcao]);
            String novo = new Scanners().lerString();
            System.out.println("Por Favor Digite o codigo do item que vc deseja alterar");
            int cd = new Scanners().lerInteiro();
            new Programa.Dao.CelularDao().alterar(campos[opcao],cd,novo);
            
        } catch (SQLException ex) {
            Logger.getLogger(CelularMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    public void excluir() {
        try {
            System.out.println("------Excluir Celular------");
            System.out.println("Por Favor Digite o Codigo do item q vc deseja excluir");
            int opcao = new Scanners().lerInteiro();
            new Programa.Dao.CelularDao().excluir(opcao);

        } catch (SQLException ex) {
            Logger.getLogger(CelularMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /*
        Dps tem q dar um jeito de deixar escrito bonitinho aqui no pesquisar.
    
    */
    @Override
    public void pesquisar() {
        try {
            String atributos[] = new String[]{"Marca", "Codigo", "Modelo"};
            System.out.println("------Pesquisar Celular------");
            System.out.println("Selecione a opção por qual quer procurar ou selecione 0 "
                    + "para voltar ao " + this.tituloMenu);
            for (int i = 1; i < atributos.length; System.out.println(i + " - " + atributos[i++]));
            int opcao = new Scanners().lerInteiro();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    ArrayList<Programa.Entidades.Celular> lista = new Programa.Dao.CelularDao().pesquisarCodigo(opcao);
                    for (int i = 0; i < lista.size(); System.out.println("A Marca é " + lista.get(i).getMarca()
                            + " e o modelo é " + lista.get(i++).getModelo()));
                    break;
                case 2:
                    new Programa.Dao.CelularDao();
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CelularMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
