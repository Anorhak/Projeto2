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
public abstract class Menu implements ITela {

    protected String item[] = new String[1];
    protected ITela[] telas = new ITela[1];
    protected String tituloMenu = "";

    @Override
    public void executar() {
        Scanner teclado = new Scanner(System.in);
        int op = -1;
        while (op != item.length) {
            System.out.println(tituloMenu);
            for (int i = 0; i < item.length; i++) {
                System.out.println(i + " - " + item[i]);
            }
            System.out.println(item.length + " - Sair");
            System.out.println("Escolha uma Opção");
            op = Integer.parseInt(teclado.nextLine());
            if (op >= 0 && op < item.length) {
                telas[op].executar();
            } else if (op != item.length) {
                System.out.println("Opção Invalida");
            }
        }
    }
}
