/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Poquedexarray {
    
    ArrayList <Pokemon> pokemones;
    
public Poquedexarray(){
    
  pokemones = new ArrayList<>();  
  
}

public void llenar(Pokemon pokemon){
   
   pokemones.add(pokemon);
}

public void mostrarpokemones(){
    
  for(Pokemon i:pokemones){
      
      System.out.println(" los pokemones son : "+i.getNombre()+" "+i.getTipo());  
  }    
}

public void evolucion(){
    
  int normal = 2000 ;  
      
 for(Pokemon i: pokemones){
     
  if(i.getAtaque()>normal){
      
      System.out.println("el pokemon ya ha evoluvionado "+i.getNombre());        
        }    
      }   
    }


public void tipo(String tipo ){
   
 for(Pokemon i:pokemones ){
     
   if(i.getTipo().equals(tipo)){
     
       System.out.println("el pokemon de este tipo es: "+i.getNombre());  
   }  
     
     
 }    
    
    
}


    
}
