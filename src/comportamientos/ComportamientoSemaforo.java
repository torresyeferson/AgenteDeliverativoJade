/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comportamientos;


import actuador.MetodosSemaforos;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;

/**
 *
 * @author Yeferson
 */
public class ComportamientoSemaforo extends Behaviour {
    Agent a;
    public ComportamientoSemaforo(Agent a) {
        this.a = a;
    }

    
    @Override
    public void action() {
        MetodosSemaforos m = new MetodosSemaforos();
        m.cambiarColor(2);
    }

    @Override
    public boolean done() {
     return true;
    }
    
}
