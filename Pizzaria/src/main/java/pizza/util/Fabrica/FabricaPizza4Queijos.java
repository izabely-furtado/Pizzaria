/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Fabrica;

import pizza.cdp.recheio.MolhoTomate;
import pizza.cdp.recheio.Gorgonzola;
import pizza.cdp.recheio.Margherita;
import pizza.cdp.recheio.Mussarela;
import pizza.cdp.recheio.Parmesao;
import pizza.cdp.recheio.Provolone;

/**
 *
 * @author IzabelyFurtado
 */
/*
. Quatro queijos:
    Ingredientes: 
        massa, 
        molho de tomate, 
        queijo parmesão, 
        queijo mussarela,
        queijo provolone,
        queijo margherita e
        queijo gorgonzola
*/
public class FabricaPizza4Queijos extends FabricaPizza{

    private final MolhoTomate molhoTomate;
    private final Mussarela queijoMussarela;
    private final Gorgonzola queijoGorgonzola;
    private final Parmesao queijoParmesao;
    private final Provolone queijoProvolone;
    private final Margherita queijoMargherita;
    
    public FabricaPizza4Queijos(){
        this.molhoTomate = super.criaMolhoTomate();
        this.queijoMussarela = super.criaQueijoMuss();
        this.queijoGorgonzola = super.criaQueijoGorg();
        this.queijoParmesao = super.criaQueijoParm();
        this.queijoProvolone = super.criaQueijoProv();
        this.queijoMargherita = super.criaQueijoMarg();
    }
    
    public MolhoTomate getMolhoTomate() {
        return this.molhoTomate;
    }
    
    public Mussarela getQueijoMussarela(){
        return this.queijoMussarela;
    }
    
    public Gorgonzola getQueijoGorgonzola(){
        return this.queijoGorgonzola;
    }
    
    public Parmesao getQueijoParmesao(){
        return this.queijoParmesao;
    }
    
    public Provolone getQueijoProvolone(){
        return this.queijoProvolone;
    }
    
    public Margherita getQueijoMargherita(){
        return this.queijoMargherita;
    }
    
    @Override
    public String toString(){
        return "Pizza 4 Queijos: \n"
                + "Ingredientes: "
                + this.molhoTomate.toString()       + ", "
                + this.queijoGorgonzola.toString()  + ", "
                + this.queijoMargherita.toString()  + ", "
                + this.queijoMussarela.toString()   + ", "
                + this.queijoParmesao.toString()    + " e "
                + this.queijoProvolone.toString();
    }
    
}
