/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class Ingrediente{
    private final String nome;
    
    Ingrediente(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}
