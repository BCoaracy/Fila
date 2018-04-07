/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] Args){
        Fila fila = new Fila();
        
        fila.Enfileirar(5);
        fila.Enfileirar(3);
        fila.Desenfileirar();
        fila.Enfileirar(7);
        fila.Desenfileirar();
        System.out.println(fila.Frente());
        fila.Desenfileirar();
        fila.Desenfileirar();
        fila.vazia();
        fila.Enfileirar(9);
        fila.Enfileirar(7);
        fila.Tamanho();
        fila.Enfileirar(3);
        fila.Enfileirar(5);
        fila.Desenfileirar();
        
    }
}
