/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Builder;

import pizza.cdp.massa.Tradicional;
import pizza.util.Fabrica.FabricaPizza4Queijos;

/**
 *
 * @author IzabelyFurtado
 */
public class Trad4QueijosBuilder extends PizzaBuilder {

    @Override
    public void buildMassa() {
        this.pizza.recheio = new FabricaPizza4Queijos();
    }

    @Override
    public void buildRecheio() {
        this.pizza.massaEscolhida = new Tradicional();
    }
    
}
