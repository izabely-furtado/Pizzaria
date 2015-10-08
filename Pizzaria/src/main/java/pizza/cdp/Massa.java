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
public abstract class Massa extends Ingrediente{

    public Massa(String nome) {
        super(nome);
    }
    
    @Override
    public String toString(){
        return "Massa";
    }
    
}
