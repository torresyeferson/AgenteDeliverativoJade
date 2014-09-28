/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sensor;

import java.util.Random;

/**
 *
 * @author Yeferson
 */
public class Sensor {
    public int sensar(){
    Random rnd = new Random();
    return (int) (rnd.nextDouble() * 2 + 0);
   }
    public static void main(String[] args) {
        System.out.println(new Sensor().sensar());
    }
}
