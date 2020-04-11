/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP 15-CD005LA
 */
public class Main {
    public static void main(String[]args){
        Jugador jugador1 = new Jugador("Nombre1","Apellidos1","ci1",23);
         Jugador jugador2 = new Jugador("Nombre2","Apellidos2","ci2",23);
          Jugador jugador3 = new Jugador("Nombre3","Apellidos3","ci3",23);
        
                 
          
          
        Jugador[] jugadoresEquipo1 = new Jugador[3];
        jugadoresEquipo1[0]= jugador1;
        jugadoresEquipo1[1]= jugador2;
        jugadoresEquipo1[2]= jugador3;
        
        
        
        
        equipo equipo1 = new equipo("Not found","varones",jugadoresEquipo1);        
        equipo[]equipos = new equipo[1];
        equipos[0]=equipo1;
        
        
        
        campeonato camp = new campeonato("Campeonato unifranz",equipos);
        
        
    }
    
}
