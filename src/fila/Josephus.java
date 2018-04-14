package fila;

import java.util.Scanner;

public class Josephus{
    
    Scanner sc = new Scanner(System.in);
    
    public void batataQuente(){
        int n = 0;
        int k = 0;
        
        System.out.println("Informe quantas quianças tem: ");
        n = sc.nextInt();
        FilaCircular f = new FilaCircular(n);
        
        System.out.println("Informe o valor de K:");
        k = sc.nextInt();
        
        for(int i=n;i>0;i--){
            for (int j=0;j<k;j++){
                passaBatata(f);
            }
            f.Desenfileirar();
        }
        System.out.println("A criança " + f.getFim() + " ganou o jogo");
    }
    
    public void passaBatata(FilaCircular F){
        F.Enfileirar("Batata");
        F.Desenfileirar();
    }
    
}
