/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116517_latihanuts4;

/**
 *
 * @author naufa
 */
public class PBO12_10116517_LatihanUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner d = new ModelDesigner();
        ModelProgrammer p = new ModelProgrammer();
        ModelSystemAnalyst s = new ModelSystemAnalyst();

        d.bonusDesigner();
        p.bonusProgrammer();
        s.bonusSystemAnalyst();

    }

}
