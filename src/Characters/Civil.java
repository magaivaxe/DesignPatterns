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
 * @author sire_marcos
 */
public class Civil extends Character
{
    //Constructors
    public Civil(){}
    public Civil(BattleSpirit spirit, Health health, Movement mov)
    {
        super(spirit, health, mov);
    }
    
}
