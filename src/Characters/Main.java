package Characters;

import Comportement.*;
import java.text.BreakIterator;

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
        Character [] chars = {new Warrior(), new Sniper(), new Civil(),
                              new Doctor(), new Surgeon()};
        
        for(int i = 0; i < chars.length; i++)
        {
            System.out.println("\nInstance of " + 
                    chars[i].getClass().getName());
            System.out.println("************** Before Changer ***************");
            
            chars[i].toCombat();
            chars[i].toMove();
            chars[i].toHealth();
        }
        
        
        
        //The armes changed
        for (int i = 0; i < chars.length; i++)
        {
            System.out.println("\nInstance of " + 
                    chars[i].getClass().getName());
            System.out.println("************** After Change ***************");
            
            switch(i)
            {
                case 1:
                    chars[i].setBattleSpirit(new KnifeCombat());
                    chars[i].setHealth(new NoHealth());
                    chars[i].setMovement(new Run());
                    break;
                case 2:
                    chars[i].setBattleSpirit(new PistolCombat());
                    chars[i].setHealth(new NoHealth());
                    chars[i].setMovement(new Run());
                    break;
                case 4:
                    chars[i].setBattleSpirit(new Pacifist());
                    chars[i].setHealth(new FirstAid());
                    chars[i].setMovement(new Run());
                    break;
                default:
                    break;
            }
            chars[i].toCombat();
            chars[i].toMove();
            chars[i].toHealth();
        }
    }
    
}
