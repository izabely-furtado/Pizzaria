/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Fabrica;

import pizza.cdp.recheio.Presunto;
import pizza.cdp.recheio.Cebola;
import pizza.cdp.recheio.MolhoTomate;
import pizza.cdp.recheio.Margherita;
import pizza.cdp.recheio.Provolone;
import pizza.cdp.recheio.Gorgonzola;
import pizza.cdp.recheio.Parmesao;
import pizza.cdp.recheio.Mussarela;
import pizza.cdp.*;
import pizza.cdp.massa.*;

/**
 *
 * @author IzabelyFurtado
 */
public class FabricaPizza implements FabricaIngredientes {

    @Override
    public Cebola criaCebola() {
        return new Cebola();
    }

    @Override
    public Cone criaMassaCone() {
        return new Cone();
    }

    @Override
    public Tradicional criaMassaTrad() {
        return new Tradicional();
    }

    @Override
    public MolhoTomate criaMolhoTomate() {
        return new MolhoTomate();
    }

    @Override
    public Presunto criaPresunto() {
        return new Presunto();
    }

    @Override
    public Gorgonzola criaQueijoGorg() {
        return new Gorgonzola();
    }

    @Override
    public Margherita criaQueijoMarg() {
        return new Margherita();
    }

    @Override
    public Parmesao criaQueijoParm() {
        return new Parmesao();
    }

    @Override
    public Provolone criaQueijoProv() {
        return new Provolone();
    }

    @Override
    public Mussarela criaQueijoMuss() {
        return new Mussarela();
    }
    
}
