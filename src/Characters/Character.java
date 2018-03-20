/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;
import Comportement.BattleSpirit;
import Comportement.Pacifist;
import Comportement.*;

/**
 *
 * @author sire_marcos
 */
public abstract class Character
{
    //Instances
    protected BattleSpirit battleSpirit = new Pacifist();
    protected Health health = new NoHealth();
    protected Movement movement = new Walk();
    
    //Default constructor without values
    public Character(){}
    //Parametric constructor
    public Character(BattleSpirit battleSpirit, Health health, Movement movement)
    {
        this.battleSpirit = battleSpirit;
        this.health = health;
        this.movement = movement;
    }
    
    /**
     * This is the polymorphism. To allocate an object type movement that it is
     * a interface that implements in 2 classes that they can use the function move.
     * This function will be used differently by the run and walk class
     */
    public void toMove()
    {
        movement.move();
    }
    public void toCombat()
    {
        battleSpirit.combat();
    }
    public void toHealth()
    {
        health.cure();
    }
    
    //Setters
    public void setBattleSpirit(BattleSpirit battleSpirit)
    {
        this.battleSpirit = battleSpirit;
    }
    public void setHealth(Health health)
    {
        this.health = health;
    }
    public void setMovement(Movement movement)
    {
        this.movement = movement;
    }
}
