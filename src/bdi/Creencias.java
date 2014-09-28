/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdi;

import java.util.HashMap;
import sensor.Sensor;

/**
 *
 * @author Yeferson
 */
public class Creencias {
    HashMap<Object,Object> mapa=new HashMap<Object,Object>();

    public Creencias() {
        Sensor s=new Sensor();
        mapa.put("Aglomeracion", s.sensar());
        mapa.put("V.Emergencia", s.sensar());
        mapa.put("AglomeracionP", s.sensar());
        mapa.put("Accidente", s.sensar());
    }

    public HashMap<Object, Object> getMapa() {
        return mapa;
    }

    public void setMapa(HashMap<Object, Object> mapa) {
        this.mapa = mapa;
    }
    
}
