/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;
import Fight.*;
import Comportement.*;

/**
 *
 * @author eleves
 */
public class Sniper extends Character
{
    //Default Constructor
    public Sniper()
    {
        this.battleSpirit = new SniperCombat();
    }
    //Paracmetric Constructor
    public Sniper(BattleSpirit spirit, Health health, Movement mov)
    {
        super(spirit, health, mov);
    }
}
