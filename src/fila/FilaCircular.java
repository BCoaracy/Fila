package fila;


public class FilaCircular {
    private int posicaoAtual=0;
    private int inicio =0;
    private int fim=0;
    private Object[] objeto = new Object[5];

    public int getFim(){
        return fim;
    }
    
    public FilaCircular(int tamanho){
        this.inicio=0;
        this.fim=0;
        this.objeto = new Object[tamanho];
    }
    
    public FilaCircular(){
        
    }
    
    public void Enfileirar(Object obj){
        if(inicio == 0 && fim == 0){
            objeto[inicio]=obj;
            fim++;
        }else
        if(!cheia()){
            if(fim==objeto.length){
                fim=0;
                objeto[fim]=obj;
            }else{
                objeto[fim]=obj;
                fim++;
            }
        }
    }
    
    public void Desenfileirar(){
        if(!this.vazia()){
            if(inicio==objeto.length){
                inicio=0;
            }else
                inicio++;
        }else
            System.out.println("Erro!");
    }
    
    public boolean cheia(){
        if(this.fim==this.objeto.length && inicio==0)
            return true;
        return false;
    }
    
    public boolean vazia(){
        if(inicio==fim&&fim==0){
            return true;
        }else
            return false;
    }
    
    public Object Frente(){
        return this.objeto[inicio];
    }
    
}
