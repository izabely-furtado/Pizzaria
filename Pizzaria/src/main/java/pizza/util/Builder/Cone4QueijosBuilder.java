/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Builder;

import pizza.cdp.Massa;
import pizza.cdp.massa.Cone;
import pizza.util.Fabrica.FabricaPizza4Queijos;

/**
 *
 * @author IzabelyFurtado
 */
public class Cone4QueijosBuilder extends PizzaBuilder {

    private Cone4QueijosBuilder() {
        super();
        this.buildMassa();
        this.buildRecheio();
    }
    
    public synchronized static PizzaBuilder getInstance() {
        if(pizzaBuilder == null) {
            pizzaBuilder = new Cone4QueijosBuilder();
        }
        return pizzaBuilder;
    }

    @Override
    public final void buildMassa() {
        this.pizza.massaEscolhida = new Cone();
    }

    @Override
    public final void buildRecheio() {
        this.pizza.recheio = FabricaPizza4Queijos.getInstance();
    }

}
