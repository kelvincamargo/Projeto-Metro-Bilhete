/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Aluno
 */
public class estacoes {
    
    public int id;
    public String nome;
    
  

    public estacoes(int ide, String nomeEstacao) {
        id = ide;
        nome = nomeEstacao;
    }
    
     @Override  
     public String toString(){  
        return nome; 
    }
      
}


