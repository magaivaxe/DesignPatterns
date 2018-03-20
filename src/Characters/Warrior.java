/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;
import Comportement.PistolCombat;
import Comportement.BattleSpirit;
import Comportement.*;

/**
 *
 * @author sire_marcos
 */
public class Warrior extends Character
{
    //Default constructor
    public Warrior()
    {
        this.battleSpirit = new PistolCombat();
    }
    //Parametric constructor
    public Warrior(BattleSpirit spirit, Health health, Movement mov)
    {
        super(spirit, health, mov);
    }
}
