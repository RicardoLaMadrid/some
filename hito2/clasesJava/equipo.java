/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP 15-CD005LA
 */
public class equipo {
    private String nombreEquipo;
    private String categoria;
    private Jugador[] jugadores;
    
    public equipo(String nombre,String categoria,Jugador[] jugadores)
    {
        this.nombreEquipo = nombre;
        this.categoria = categoria;
    }
     public Jugador[]getjugador(){
        return jugadores;
     }
}