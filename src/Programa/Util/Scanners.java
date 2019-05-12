/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa.Util;

import java.util.Scanner;

/**
 *
 * @author Everton
 */
public final class Scanners {
    
    public int lerInteiro(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();    
    }
    public String lerString(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    
}
