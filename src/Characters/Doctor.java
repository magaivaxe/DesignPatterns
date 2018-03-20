/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;

import Comportement.BattleSpirit;
import Comportement.FirstAid;
import Comportement.Health;
import Comportement.Movement;

/**
 *
 * @author eleves
 */
public class Doctor extends Character
{
    //Default Constructor 
    public Doctor()
    {
        this.health = new FirstAid();
    }
    //Parametric Constructor
    public Doctor(BattleSpirit spirit, Health health, Movement mov)
    {
        super(spirit, health, mov);
    }
}
