/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Builder;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class PizzaBuilder {
    protected PizzaProduct pizza;
    
    public PizzaBuilder(){
        pizza = new PizzaProduct();
    }
    
    public abstract void buildMassa();
    
    public abstract void buildRecheio();
    
    public PizzaProduct getPizza(){
        return this.pizza;
    }
    
}
