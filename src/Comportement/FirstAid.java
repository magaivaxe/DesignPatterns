/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportement;

/**
 *
 * @author sire_marcos
 */
public class FirstAid implements Health
{

    @Override
    public void cure()
    {
        System.out.println("I health you");
    }
    
}
