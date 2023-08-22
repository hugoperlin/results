package com.github.hugoperlin.results;

public class Sucesso<T> extends Resultado {


    private T obj;

    /**
     * Cria um objeto que representa um resultado
     * com sucesso.
     * 
     * @param msg Mensagem de sucesso.
     */ 
    public Sucesso(String msg,T obj) {
        super(msg);
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }
    
    
}
