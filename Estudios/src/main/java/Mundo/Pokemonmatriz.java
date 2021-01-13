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
public class Pokemonmatriz {
    
  Pokemon [][] pokemones;

public Pokemonmatriz(){
    
 pokemones = new Pokemon[2][2];   
}  

public void llenarmatriz(){
    
  pokemones[0][0]= new Pokemon("bulbasaur","planta",1000,500); 
  pokemones[0][1]= new Pokemon("bulbasaur","planta",1000,500);
  
  pokemones[1][0]= new Pokemon("bulbasaur","planta",1000,500);
  pokemones[1][1]= new Pokemon("bulbasaur","planta",1000,500);
    
}

public void mostrar(){
    
  for(int i=0; i<pokemones.length;i++){
 
  for(int j=0; j<pokemones[i].length;i++){
     
      System.out.println("los nombre de los alumnos son "+pokemones[i][j].getNombre()+" y su tipo es "+pokemones[i][j].getTipo()); 
          }
    }
}  


public void promedioataque(){
    
    int promedio=0;
    
 for(int i=0; i<pokemones.length;i++){
 
  for(int j=0; j<pokemones[i].length;i++){
     
      
          }
    }    
    
    
    
}














}

        










