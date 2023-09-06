package com.github.hugoperlin.results;


/***
 * Classe responsável por representar um resultado
 * falho de uma operação. 
 */

public class Erro extends Resultado {

   /**
     * Cria um objeto que representa um resultado falho de uma
     * operação.
     * 
     * @param msg Mensagem de falha.
     */
    public Erro(String msg) {
        super(msg);
    }
    
}
