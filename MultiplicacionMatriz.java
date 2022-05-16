/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multiplicacionmatriz;

/**
 *
 * @author 51923
 */
public class MultiplicacionMatriz {

    public static void main(String[] args) {
       Matriz matriz=new Matriz();
       
       matriz.IngresaTama();
       matriz.agregarMatriz1();
       matriz.mostrarMatriz();
       
       matriz.IngresaTama2();
       matriz.agregarMatrices2();
       matriz.mostrarMatriz2();
       
       matriz.MultiplicarMatriz();
       matriz.MostrarMultiplicacion();
        
        
    }
}
