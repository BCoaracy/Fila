package fila;


public class FilaCircular {
    private int posicaoAtual=0;
    private int inicio =0;
    private int fim=0;
    private Object[] objeto = new Object[10];
    
    public void Enfileirar(Object obj){
        if(inicio == 0 && fim == 0){
            objeto[inicio]=obj;
            fim++;
        }else
        if(!cheia()){
            objeto[fim]=obj;
            if(fim==objeto.length){
                fim=0;
            }else
                fim++;
        }
    }
    
    public void Desenfileirar(){
        if(!this.vazia()){
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
}
