/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abinario;

/**
 *
 * @author eskat
 */
public class Exe {
    
    public static void main (String[] args){
        /**
        ArbolBinario<Integer> ab = new ArbolBinario<Integer>();
        ab.agregarNodo(46);
        ab.agregarNodo(56);
        ab.agregarNodo(6);
        ab.agregarNodo(2);
        ab.agregarNodo(88);
        ab.agregarNodo(8);
        ab.agregarNodo(17);
        ab.agregarNodo(17);
        ab.agregarNodo(9);
        ab.agregarNodo(70);
        ab.agregarNodo(13);
        ab.agregarNodo(32);
        //System.out.println(ab.esPerfecto());

        //System.out.println(ab.raiz.ladoIzquierdo.ladoDerecho.altura());
        
               */    
        
        
        //giro derecha
//        ArbolBinario<Integer> ab2 = new ArbolBinario<Integer>();
//        ab2.agregarNodo(10);
//        ab2.agregarNodo(5);
//        ab2.agregarNodo(3);
//        System.out.println("Arbol, raiz: "+ab2.raiz.getNumero());
//        ab2.recorrerIRD();
        

        //Doble
        ArbolBinario<Integer> ab = new ArbolBinario<Integer>();
        ab.agregarNodo(15);
        ab.agregarNodo(17);
        ab.agregarNodo(12);
        ab.agregarNodo(14);
        ab.agregarNodo(8);
        ab.agregarNodo(19);
        ab.agregarNodo(21);
        System.out.println("Arbol, raiz: "+ab.raiz.getNumero());
        ab.recorrerIRD();

        //Giro Izquierda
        ArbolBinario<Integer> ab3 = new ArbolBinario<Integer>();
        ab3.agregarNodo(15);
        ab3.agregarNodo(17);
        ab3.agregarNodo(12);
        ab3.agregarNodo(8);
        ab3.agregarNodo(14);
        ab3.agregarNodo(13);
        System.out.println("Arbol, raiz: "+ab3.raiz.getNumero());
        ab3.recorrerIRD();
        
        
        
    }
    
}
