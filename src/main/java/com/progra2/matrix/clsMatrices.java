/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra2.matrix;

import java.util.Scanner;

/**
 *
 * @author Yesica Arroyo */

public class clsMatrices {
      private static String[][] ma = new String[8][8];
    
    
    private static void cargaMatriz(){
        for (int c=0; c<ma.length;c++){
          for (int f=0; f< ma.length;f++){
              ma[f][c] ="X";
          }
        }
    }
    
    private static void imprimeMatriz(){
          for (int c=0; c<ma.length;c++){
            for (int f=0; f< ma.length;f++){
                System.out.print(ma[f][c]); 
            }
              System.out.println(" ");
          }
          
        }
 
    
   public static void imprimirDecorado(){
        for (int x=0; x< ma.length;x++){
            System.out.print("|");
             for(int y=0;y < ma[x].length;y++){
                 System.out.print(ma[x][y]);
                 if (y != ma[x].length -1){
                     System.out.print("\t");
                 }
             }
             System.out.println("|");
        }
    }
    public static void columnasPares(){
        for (int f=0; f < ma.length; f++){
            for (int c=0; c< ma.length;c++){
                if (c%2==0){
                 ma[f][c]="P";
                }
                
            
            }
        }
    }
       public static void columnasX(){
        int columnas=0;
        try {
            for (int f=0; f< ma.length;f++){
                ma[f][f]="\\";
                columnas = ma.length -f;
                if (columnas !=8){
                    ma[f][columnas]="/";    
            }   }
            
        } catch (Exception e) {
            System.out.println("direccion index bound:"+ columnas);    
            }
       }
       
       public static void InvertirL(){
           
   int columnas=0;
        int f=0;
        int i=0;
        try {
            while (i<1)
            {
            for (int c=0; c< ma.length;c++){
             f++;   
                ma[c][0]="\\"; 
                 columnas = ma.length -f;
                if(columnas !=8){  
                ma[7][columnas]="\\";
                }
            }
            }
        } catch (Exception e) {
            System.out.println("direccion index bound:"+ columnas);
        }
    }
                   public static void columnasLinversa(){
        int columnas=0;
        int f=0;
        int i=0;
        try {
            while(i<1){
            for (int c=0; c< ma.length;c++){
             f++;   
                ma[0][c]="\\"; 
                 columnas = ma.length -f;
                if(columnas !=8){  
                ma[columnas][7]="\\";
                }
            }
            }
        } catch (Exception e) {
            System.out.println("direccion index bound:"+ columnas);
        }
    }
   
       

      
        public static void matrizz() {
             Scanner sn=new Scanner(System.in);
        System.out.println("Escribe un tamaño");
        int tamanio=sn.nextInt();
         
        int matriz1[][]=new int[tamanio][tamanio];
        int matriz2[][]=new int[tamanio][tamanio];
         
        int resultado[][]=new int[tamanio][tamanio];
         
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){
                 
                System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1");
                matriz1[i][j]=sn.nextInt();
                System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 2");
                matriz2[i][j]=sn.nextInt();
                 
                resultado[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
         
        System.out.println("Matriz 1");
        muestraMatriz(matriz1);
         
        System.out.println("Matriz 2");
        muestraMatriz(matriz2);
         
        System.out.println("Matriz resultante");
        muestraMatriz(resultado);
                 
    }
        
        
     
    public static void muestraMatriz(int[][] matriz){
     
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
         
    }
     
    

                

         
         
    
    public static void main(String[] args) {
      cargaMatriz();
        imprimeMatriz();
         //columnasX();
         matrizz();
         //InvertirL();
         //columnasLinversa();
           //columnasPares();
          imprimirDecorado();
      
               
    }
    
    
}
