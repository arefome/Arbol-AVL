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
public class ArbolBinario<E> {
    
    NodoArbol<E> raiz;
    
    public ArbolBinario(){
      raiz = null;
    }
    
    public boolean esPerfecto(){
      int nodos = 1 + raiz.cantidadHijos();
        return nodos == Math.pow(2,raiz.getAltura()) - 1;
    }


    public void equilibrar(NodoArbol<E> rev){
        NodoArbol<E> P = null,Q = null;
        while(rev.getFe()<=1 && rev.getFe()>=-1){
            rev = rev.getPadre();
        }
        P = rev;
        Q = P.getHijoAlto();
        System.out.println("p:"+ P.getNumero() +" q:"+Q.getNumero());
        System.out.println("fe p:"+ P.getFe() +" fe q:"+Q.getFe());
        if(P.getFe() > 0 && Q.getFe() > 0) {
            System.out.println("Giro a la Derecha");
            rotarDerecha(P,Q);
        }
        if(P.getFe() < 0 && Q.getFe() < 0) {
            System.out.println("Giro a la izquierda");
            rotarIzquierda(P,Q);
        }
        if(P.getFe() > 0 && Q.getFe() < 0) {
            System.out.println("Giro doble: izquierda, derecha");
            NodoArbol<E> R = Q.getHijoAlto();
            rotarIzquierda(Q,R);
            rotarDerecha(P,Q);
        }
        if(P.getFe() < 0 && Q.getFe() > 0){
            System.out.println("Giro doble: derecha, izquierda");
            NodoArbol<E> R = Q.getHijoAlto();
            rotarDerecha(Q,R);
            rotarIzquierda(P,Q);
        }
    }
    
    public void rotarDerecha(NodoArbol<E> p,NodoArbol<E> q){
        NodoArbol aux = p.getLadoDerecho();
        E auxp = p.getNumero(); 
        p.setNumero(q.getNumero());
        p.setLadoIzquierdo(q.getLadoIzquierdo());
        p.setLadoDerecho(new NodoArbol(auxp,p));
        p.getLadoDerecho().setLadoDerecho(aux);
        p.getLadoDerecho().setLadoIzquierdo(q.getLadoDerecho());
    }
    
    public void rotarIzquierda(NodoArbol<E> p,NodoArbol<E> q){
        NodoArbol aux = p.getLadoIzquierdo();
        E auxp = p.getNumero(); 
        p.setNumero(q.getNumero());
        p.setLadoDerecho(q.getLadoDerecho());
        p.setLadoIzquierdo(new NodoArbol(auxp,p));
        p.getLadoIzquierdo().setLadoIzquierdo(aux);
        p.getLadoIzquierdo().setLadoDerecho(q.getLadoIzquierdo());
    }
    
    public void agregarNodo(E dato){
      if(raiz == null){
        raiz = new NodoArbol<E>(dato, null);
      }else{
        NodoArbol<E> nodo = raiz.agregarNodo(dato);
        raiz.calcularAltura();
        if(raiz.calcularFE()){
          System.out.println("desequilibrado en: "+dato);
          equilibrar(nodo);
        }
      }
    }

    public void recorrerIRD(){
      raiz.recorrerIRD();
    }

    public void recorrerRID(){
      raiz.recorrerRID();
    }

    public void recorrerDRI(){
      raiz.recorrerDRI();
    }

    public void recorrerRDI(){
      raiz.recorrerRDI();
    }
    

   
    
}
