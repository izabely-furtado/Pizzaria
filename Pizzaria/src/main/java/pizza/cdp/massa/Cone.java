/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.massa;

import pizza.cdp.Massa;

/**
 *
 * @author IzabelyFurtado
 */
public class Cone extends Massa {

    public Cone() {
        super("Cone");
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + this.getNome();
    }
    
}
