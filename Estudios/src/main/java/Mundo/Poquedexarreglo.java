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
public class Poquedexarreglo {
    
   Pokemon [] pokemones; 

    public Poquedexarreglo() {
        
     pokemones = new Pokemon[6]; 
        
    }
    
   public void llenararreglo(){
      
     pokemones[0]= new Pokemon("bulbasaur","planta",1000,500);
     pokemones[1]= new Pokemon("charizard","fuego",6000,5000);
     pokemones[2]= new Pokemon("rowlet","volador",1000,500);
     pokemones[3]= new Pokemon("squirtle","agua",1000,900);
     pokemones[4]= new Pokemon("snorlax","normal",1500,12000);
     pokemones[5]= new Pokemon("mewtwo","psiquico",10000,9000);
     
   }
   
   public void mostrarpokemones(){
       
    for(int i =0; i<pokemones.length; i++){
       
        System.out.println("los pokemones son: "+pokemones[i].getNombre()+" "+pokemones[i].getTipo());   
   }   
       
       
       
   }
   
   public void pokemonmasfuerte(){
       
     int mayor =  pokemones[0].getAtaque();
     String nombre =  pokemones[0].getNombre();
             
    for(int i=0 ; i<pokemones.length; i++ ){
        
    if(pokemones[i].getAtaque()>mayor){
        
       mayor=pokemones[i].getAtaque();
       nombre= pokemones[i].getNombre();
         }    
        }   
    System.out.println("el pokemon mas fuerte es :"+nombre+"con un ataque de "+mayor);    
   }
   
   public void pokemonmasdefensivo(){
       
     int defensa =  pokemones[0].getDefensa();
     String nombre =  pokemones[0].getNombre();
             
    for(int i=0 ; i<pokemones.length; i++ ){
        
    if(pokemones[i].getDefensa()>defensa){
        
       defensa=pokemones[i].getDefensa();
       nombre= pokemones[i].getNombre();
         }    
        }  
    System.out.println("el pokemon mas defensivo es :"+nombre+" con una defensa de "+defensa); 
   }
   
   public void buscatupokemon(String tipo){
       
       for(int i=0 ; i<pokemones.length; i++ ){
        
    if( pokemones[i].getNombre() == tipo){
        
        System.out.println("el pokemon que busca es :"+pokemones[i].getNombre());
         }    
        }       
       
   }
   
   
   
}
