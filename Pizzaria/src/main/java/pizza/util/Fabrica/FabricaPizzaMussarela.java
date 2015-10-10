/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Fabrica;

import pizza.cdp.recheio.Gorgonzola;
import pizza.cdp.recheio.Mussarela;
import pizza.cdp.recheio.Cebola;
import pizza.cdp.recheio.MolhoTomate;
import pizza.cdp.recheio.Presunto;
/**
 *
 * @author IzabelyFurtado
 */

/*Mussarela:
    Ingredientes: 
        massa, 
        molho de tomate, 
        queijo mussarela, 
        queijo gongorzola,
        cebola e 
        presunto;
*/
public class FabricaPizzaMussarela extends FabricaPizza{
    
    private final MolhoTomate molhoTomate;
    private final Mussarela queijoMussarela;
    private final Gorgonzola queijoGorgonzola;
    private final Cebola cebola;
    private final Presunto presunto;
    
    private FabricaPizzaMussarela(){
        this.molhoTomate = super.criaMolhoTomate();
        this.queijoMussarela = super.criaQueijoMuss();
        this.queijoGorgonzola = super.criaQueijoGorg();
        this.cebola = super.criaCebola();
        this.presunto = super.criaPresunto();
    }
        
    public synchronized static FabricaPizza getInstance() {
        if(fabPizza == null) {
            fabPizza = new FabricaPizzaMussarela();
        }
        return fabPizza;
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
    
    public Cebola getCebola(){
        return this.cebola;
    }
    
    public Presunto getPresunto(){
        return this.presunto;
    }
    
    @Override
    public String toString(){
        return "Pizza Mussarela: \n"
                + "Ingredientes: "
                + this.molhoTomate.toString()       + ", "
                + this.queijoGorgonzola.toString()  + ", "
                + this.queijoMussarela.toString()   + ", "
                + this.cebola.toString()            + " e "
                + this.presunto.toString();
    }
    
    
}
