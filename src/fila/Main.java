/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        int menu = -1;
        Scanner sc = new Scanner(System.in);
        
        while(menu!=0){
                System.out.println("informe o exercicio:"
                    + "1 - Para a tabela teste da fila;"
                    + "2 - Para o exercicio 2"
                    + "3 - Para a brincadeira da batata quente;");
                    menu = sc.nextInt();
            switch(menu){
                case 1:
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
                break;
                case 2:
                    FilaCircular fc = new FilaCircular();
                    for(int i = 0; i<5;i++){
                        fc.Enfileirar(i);
                    }
                    System.out.println("Frente da fila -> " + fc.Frente());
                    fc.Desenfileirar();
                    System.out.println("Frente da fila -> " + fc.Frente());
                    fc.Enfileirar("out!");
                break;
                case 3:
                    Josephus j = new Josephus();
                    j.batataQuente();
                break;

            }
        }
        
    }
}
