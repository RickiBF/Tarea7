/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multiplicacionmatriz;

import javax.swing.*;


public class Matriz {
     private int matrizA[][],matrizB[][],matrizC[][];

    private int filaA,filaB;

    private int columnaA,columnaB;
    
    private int valores;
    
     /*-------------------INGRESO DE DATOS PRIMERA MATRIZ-----------------*/
    
    public void IngresaTama()
    {
        filaA = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila de la primera matriz"));

        columnaA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna de la primera matriz"));

        this.matrizA = new int[filaA][columnaA];
    }
    
    public void agregarMatriz1()
    {
        for (int filaA=0; filaA < this.matrizA.length; filaA++)
        {
            for (int columnaA=0; columnaA < this.matrizA[filaA].length; columnaA++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores"));

                this.matrizA[filaA][columnaA] = this.valores;
            }
        }
    }
    
    public void mostrarMatriz()
    {
        System.out.println("-------PRIMERA MATRIZ-------");
        for(int filaA=0; filaA < this.matrizA.length; filaA++)
        {
            for(int columnaA=0; columnaA < this.matrizA[filaA].length; columnaA++)
            {
                
                System.out.printf("%d ", this.matrizA[filaA][columnaA]);
            }

            System.out.println();
        }
    }
    
    /*------------------------SEGUNDA MATRIZ-----------------------*/
    /*------------------------------MATRIZ B------------------                */
    public void IngresaTama2()
    {
        filaB = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila de la Segunda matriz matriz"));

        columnaB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna de la Segunda matriz"));

        this.matrizB = new int[filaB][columnaB];
    }
    
    public void agregarMatrices2()
    {
        for (int filaB=0; filaB < this.matrizB.length; filaB++)
        {
            for (int columnaB=0; columnaB < this.matrizB[filaB].length; columnaB++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores"));

                this.matrizB[filaB][columnaB] = this.valores;
            }
        }
    }
    
    
    public void mostrarMatriz2()
    {
        System.out.println("-------SEGUNDA MATRIZ MATRIZ-------");
        for(int filaB=0; filaB < this.matrizB.length; filaB++)
        {
            for(int columnaB=0; columnaB < this.matrizB[filaB].length; columnaB++)
            {
                
                System.out.printf("%d ", this.matrizB[filaB][columnaB]);
            }

            System.out.println();
        }
    }
    
    /*-------------------MULTIPLICAR MATRIZ----------------*/
    public void MultiplicarMatriz()
    {
    
            this.matrizC=new int[filaA][filaA];
            int c,f,i;
            for(f=0; f<filaA; f++){
                for(c=0; c<columnaB; c++){
                    for(i=0; i<filaB;i++){
                        matrizC[f][c] += matrizA[f][i]*matrizB[i][c];
                    }
                }
            }
    }
    
    void MostrarMultiplicacion()
    {   
        System.out.println("------- MULTIPLICACION DE  LA MATRIZ A Y B -------");
        int f,c;
        for(f=0; f<filaA; f++){
            for(c=0; c<columnaB; c++){
                System.out.printf("%d ", this.matrizC[f][c]);
            }
            System.out.println();
        }
    }
}
