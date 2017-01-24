/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.Scanner;

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
        int choix;
        
        do{
            System.out.println("\n\n---Menu---");
            System.out.println("0. QUitter");
            System.out.println("1. Voir le garage");
            System.out.println("2. Ajouter un véhicule");
            
            choix = new Scanner(System.in).nextInt();
            
            switch(choix){
                case 1:
                    System.out.println(monGarage);
                    break;                
                case 2:
                    //Permet d'ajouter un véhicule à monGarage, en précisant le nom et la panne.
                    System.out.println("--Ajout d'un véhicule--");
                    System.out.println("Nom:");
                    String nom = new Scanner(System.in).nextLine();
                    System.out.print("Panne : ");
                    String panne = new Scanner(System.in).nextLine();
                    
                    monGarage.add(new VehiculeEnPanne(nom,panne));
            }
        }while(choix!=0);
    }
    
}
