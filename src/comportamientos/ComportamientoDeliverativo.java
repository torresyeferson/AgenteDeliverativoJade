/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comportamientos;

import actuador.Intenciones;
import bdi.Creencias;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;

/**
 *
 * @author Yeferson
 */
public class ComportamientoDeliverativo extends Behaviour{
    Agent a;
    public ComportamientoDeliverativo(Agent a) {
        this.a = a;
    }
    @Override
    public void action() {
        Creencias c= new Creencias();
        Intenciones in= new Intenciones();
        
     if(Integer.parseInt(c.getMapa().get("Aglomeracion").toString())==1&&Integer.parseInt(c.getMapa().get("Accidente").toString())==1){
        //EJECUTAR LAS INTENCIONES
         in.cambioLuz("Verde izquierda");
     }
     else{
      if(Integer.parseInt(c.getMapa().get("V.Emergencia").toString())==1){
        //EJECUTAR LAS INTENCIONES
          in.cambioLuz("Verde");
     }
     }   
    }

    @Override
    public boolean done() {
        return false;
    }
    
}
