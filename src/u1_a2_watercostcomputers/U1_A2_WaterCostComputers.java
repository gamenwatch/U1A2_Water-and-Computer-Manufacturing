/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u1_a2_watercostcomputers;
import java.util.Scanner;
/**
 *Jacob Lacey
 *Oct 2 2018
 *To Calculate the Amount of Water it Cost for Users Monitors/Computers w/ their Input
 */
public class U1_A2_WaterCostComputers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //start Scanner
        Scanner keyedInput = new Scanner(System.in);
  
        //state variables
        final double WATER_COST_COMPUTERMONITOR = 1.5;//tons
        double numberOfCombosMonComp;
        double totalWaterCost;//tons
        
        //Welcome Message
        System.out.println("Welcome to WaterCalc! Please answer the follwing questions.");
        
        //Instructions
        System.out.println("How many monitor/computer combos do you own?");
        //Calculations
        numberOfCombosMonComp = keyedInput.nextDouble();
        totalWaterCost = numberOfCombosMonComp*WATER_COST_COMPUTERMONITOR;
        
        //Output
        System.out.println("It took "+totalWaterCost+" tons of water to create your current number of computers and monitors.");
        
        
    }
    
}
