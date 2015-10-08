/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.util.Builder;

import pizza.util.Fabrica.FabricaPizza;
import pizza.cdp.Massa;

/**
 *
 * @author IzabelyFurtado
 */
public class PizzaProduct {

    Massa massaEscolhida;
    FabricaPizza recheio;

    public Massa getMassa() {
        return this.massaEscolhida;
    }

    public FabricaPizza getPizza() {
        return this.recheio;
    }

    @Override
    public String toString() {
        return this.massaEscolhida.toString() + "\n"
             + this.recheio.toString()          + "\n";
    }
}
