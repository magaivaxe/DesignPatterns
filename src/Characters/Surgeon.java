/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;
import Comportement.*;

/**
 *
 * @author eleves
 */
public class Surgeon extends Character
{
    //Default Constructor
    public Surgeon()
    {
        this.battleSpirit = new ShotgunCombat();
        this.health = new Surgery();
    }
    //Parametric Constructor
    public Surgeon(BattleSpirit spirit, Health health, Movement mov)
    {
        super(spirit, health, mov);
    }
}
