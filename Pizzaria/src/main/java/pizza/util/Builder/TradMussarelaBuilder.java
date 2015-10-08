/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Builder;

import pizza.cdp.massa.Tradicional;
import pizza.util.Fabrica.FabricaPizzaMussarela;

/**
 *
 * @author IzabelyFurtado
 */
public class TradMussarelaBuilder extends PizzaBuilder {

    @Override
    public void buildMassa() {
        this.pizza.massaEscolhida = new Tradicional();
    }

    @Override
    public void buildRecheio() {
        this.pizza.recheio = new FabricaPizzaMussarela();
    }
    
}
