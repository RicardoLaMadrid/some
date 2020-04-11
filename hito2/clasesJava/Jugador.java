/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP 15-CD005LA
 */
public class Jugador {
    private String nombrecompleto;
    private String apellidos;
    private String ci;
    private int edad;
    
    public Jugador(String nombrecompleto,String apellidos,String ci,int edad)
{
this.nombrecompleto = nombrecompleto;
this.apellidos = apellidos;
this.ci = ci;
this.edad = edad;
}
     public void ImprimirJugador(){
      System.out.println(this.nombrecompleto);
          System.out.println(this.apellidos);
        
     }
     }
}
