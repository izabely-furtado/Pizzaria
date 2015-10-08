/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.recheio;

import pizza.cdp.recheio.Queijo;

/**
 *
 * @author IzabelyFurtado
 */
public class Parmesao extends Queijo{

    public Parmesao() {
        super("Parmesão");
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + this.getNome();
    }
    
}
