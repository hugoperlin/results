package com.github.hugoperlin.results;

/***
 * Classe responsável por representar o resultado de uma operação 
 * realizada. 
 */


public abstract class Resultado<S> {
    private String msg;

    public Resultado(String msg){
        this.msg = msg;
    }

    public static <S> Resultado<S> sucesso(String msg,S obj){
        return new Sucesso<S>(msg,obj);
    }

    public static <S> Resultado<S> erro(String msg){
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

    public Sucesso<S> comoSucesso(){
        return (Sucesso<S>)this;
    }

    public String getMsg(){
        return msg;
    }
}
