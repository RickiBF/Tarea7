package com.mycompany.sumamatriz;
import javax.swing.*;

public class suma {
    private int matrizA[][],matrizB[][],matrizC[][];

    private int fila;

    private int columna;
    
    private int valores;
    
    /*-------------------INGRESO DE DATOS PRIMERA MATRIZ-----------------*/
    
    public void IngresaTama()
    {
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila de la primera matriz"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna de la primera matriz"));

        this.matrizA = new int[fila][columna];
    }
    
    public void agregarMatriz1()
    {
        for (int fila=0; fila < this.matrizA.length; fila++)
        {
            for (int columna=0; columna < this.matrizA[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores"));

                this.matrizA[fila][columna] = this.valores;
            }
        }
    }
    
    public void mostrarMatriz()
    {
        System.out.println("-------PRIMERA MATRIZ-------");
        for(int fila=0; fila < this.matrizA.length; fila++)
        {
            for(int columna=0; columna < this.matrizA[fila].length; columna++)
            {
                
                System.out.printf("%d ", this.matrizA[fila][columna]);
            }

            System.out.println();
        }
    }
    
    /*------------------------------MATRIZ B------------------                */
    public void IngresaTama2()
    {
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila de la Segunda matriz matriz"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna de la Segunda matriz"));

        this.matrizB = new int[fila][columna];
    }
    
    public void agregarMatrices2()
    {
        for (int fila=0; fila < this.matrizB.length; fila++)
        {
            for (int columna=0; columna < this.matrizB[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores"));

                this.matrizB[fila][columna] = this.valores;
            }
        }
    }
    
    
    public void mostrarMatriz2()
    {
        System.out.println("-------SEGUNDA MATRIZ MATRIZ-------");
        for(int fila=0; fila < this.matrizB.length; fila++)
        {
            for(int columna=0; columna < this.matrizB[fila].length; columna++)
            {
                
                System.out.printf("%d ", this.matrizB[fila][columna]);
            }

            System.out.println();
        }
    }
    
    
    /*-------------------SUMA DE MATRICES-------------*/  
    
    public void sumarMatrices2(){
   
        this.matrizC=new int[matrizB.length][matrizB[0].length];
        if(matrizA.length == matrizB.length)
        {
        System.out.println("-------SUMA DE MATRICES-------");
        for(int fila=0; fila < this.matrizB.length; fila++)
            {
                for (int columna=0; columna < this.matrizB[fila].length; columna++)
                {
                    this.matrizC[fila][columna]=this.matrizA[fila][columna]+this.matrizB[fila][columna];
                }
            }
        }else
        {
            System.out.println();
            System.out.println("No se puede realizar la suma debido a que no tienen el mismp tamaño de filas y columnas");
        }
        
    }
    
    
     
    /*--------------------MOSTRAR SUMA DE MATRICES-------------- */
    public void MostrarSuma()
    {
        for(int fila=0; fila < this.matrizC.length; fila++)
        {
            for(int columna=0; columna < this.matrizC[fila].length; columna++)
            {
                
                System.out.printf("%d ", this.matrizC[fila][columna]);
            }

            System.out.println();
        }
    }
    
}
