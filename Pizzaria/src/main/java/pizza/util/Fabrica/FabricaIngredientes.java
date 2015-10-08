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
import pizza.cdp.recheio.Mussarela;
import pizza.cdp.recheio.Parmesao;
import pizza.cdp.*;
import pizza.cdp.massa.*;

/**
 *
 * @author IzabelyFurtado
 */
public interface FabricaIngredientes {
    public Cebola criaCebola();
    
    //public Massa criaMassa();
    public Cone criaMassaCone();
    public Tradicional criaMassaTrad();
    
    public MolhoTomate criaMolhoTomate();
    public Presunto criaPresunto();
    
    //public Queijo criaQueijo();
    public Gorgonzola criaQueijoGorg();
    public Margherita criaQueijoMarg();
    public Mussarela criaQueijoMuss();
    public Parmesao criaQueijoParm();
    public Provolone criaQueijoProv();
    
}
