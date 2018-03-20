package Characters;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sire_marcos
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //The characters
        Character [] chars = {new Warrior(), new Civil(), new Doctor()};
        
        for (int i = 0; i < 0; i++)
        {
            System.out.println("\nInstance of " + 
                    chars[i].getClass().getName());
            System.out.println("*******************************************");
            
            chars[i].toCombat();
            chars[i].toMove();
            chars[i].toHealth();
        }
    }
    
}
