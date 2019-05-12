/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa.View.Texto;

import Programa.Util.Util;
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
        System.out.println("Inserir Celular");
        System.out.println("Por Favor Informe a Marca do Celular?");
        String marca = Util.ler();
        System.out.println("Por Favor Informe o Modelo do Celular.");
        String modelo = Util.ler();
        try {
            new Programa.Dao.CelularDao().inserir(new Programa.Entidades.Celular(modelo, marca));
        } catch (Exception ex) {
            Logger.getLogger(CelularMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
