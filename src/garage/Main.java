/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Garage monGarage = new Garage();
        VehiculeEnPanne v = new VehiculeEnPanne();
        
        monGarage.add(v);
        monGarage.add(v);
        System.out.println(monGarage);
    }
    
}
