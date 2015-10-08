/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.recheio;

/**
 *
 * @author IzabelyFurtado
 */
public class Margherita extends Queijo {

    public Margherita() {
        super("Margherita");
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.getNome();
    }
    
}
