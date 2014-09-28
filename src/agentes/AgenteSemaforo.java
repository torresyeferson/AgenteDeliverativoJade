/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentes;
import jade.core.Agent;


/**
 *
 * @author Yeferson
 */
public class AgenteSemaforo extends Agent{
    
    @Override
    protected void setup(){
    }

    @Override
    protected void takeDown() {
        super.takeDown(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Agente"+this.getLocalName()+"Muerto!!!! pero me vengare");
    }
    
   
}
