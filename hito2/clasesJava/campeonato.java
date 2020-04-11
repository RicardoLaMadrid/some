/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP 15-CD005LA
 */
public class campeonato {
    private String nombrecampeonato;
    private equipo[] equipos;
    
    public campeonato (String nombrecampeonato,equipo[]equipos){
        this.nombrecampeonato = nombrecampeonato;
        this.equipos=equipos;
    }
    public equipo[]getequipos(){
        return equipos;
    
}
    public void setequipos(equipo[] equipos){
        this.equipos = equipos;
        
    }
    public void Imprimircampeonato(){
        System.out.println(this.nombrecampeonato);
        for(int i=0;i<this.equipos.length;i++)
        {
            this.jugadores[i].ImprimirJugador();
           
        }
    }
}
