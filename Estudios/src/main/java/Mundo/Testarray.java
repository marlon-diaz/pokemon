/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 *
 * @author Lenovo
 */
public class Testarray {
    
    public static void main(String[] args) {
        
        Poquedexarray ash = new Poquedexarray();
    
    
    
 ash.llenar( new Pokemon("bulbasaur","planta",1000,500));
 ash.llenar( new Pokemon("charizard","fuego",6000,5000));
 ash.llenar( new Pokemon("rowlet","volador",13000,500));
 ash.llenar( new Pokemon("squirtle","agua",1000,900));
 ash.llenar( new Pokemon("snorlax","normal",1500,12000));
 ash.llenar( new Pokemon("mewtwo","psiquico",10000,9000));
    
 ash.mostrarpokemones();
 ash.evolucion();
 ash.tipo("fuego");
    
         } 
}
