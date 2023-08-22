package com.github.hugoperlin.results;

/***
 * Classe responsável por representar o resultado de uma operação 
 * realizada. 
 */


public abstract class Resultado {
    private String msg;

    public Resultado(String msg){
        this.msg = msg;
    }

    public static Resultado sucesso(String msg,Object obj){
        return new Sucesso(msg,obj);
    }

    public static Resultado erro(String msg){
        return new Erro(msg);
    }

    public boolean foiErro(){
        return this instanceof Erro;
    }

    public boolean foiSucesso(){
        return this instanceof Sucesso;
    }

    public Erro comoErro(){
        return (Erro)this;
    }

    public Sucesso comoSucesso(){
        return (Sucesso)this;
    }

    public String getMsg(){
        return msg;
    }
}
