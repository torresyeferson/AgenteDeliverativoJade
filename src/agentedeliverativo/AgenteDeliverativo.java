/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentedeliverativo;

import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yeferson
 */
public class AgenteDeliverativo {

    /**
     * @param args the command line arguments
     */
    AgentController controlador;
    AgentContainer contenedor;
    public void crearContenedor(){
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        runtime.setCloseVM(true);
        jade.core.Profile perfil= new ProfileImpl(null, 1099, null);
        contenedor=runtime.createMainContainer(perfil);
    }
    public void inicarAgente(){
        try {
//            controlador=contenedor.createNewAgent("agentesemaforo", agentes.AgenteSemaforo.class.getName(), null);
//            controlador.start();
            controlador=contenedor.createNewAgent("agentedelivarativo", agentes.AgenteDeliverativo.class.getName(), null);
            controlador.start();
        } catch (StaleProxyException ex) {
            Logger.getLogger(AgenteDeliverativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        AgenteDeliverativo ag=new AgenteDeliverativo();
        ag.crearContenedor();
        ag.inicarAgente();
    }
    
}
